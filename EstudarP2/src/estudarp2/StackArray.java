package estudarp2;

public class StackArray implements Stack {

    Object[] stack;
    int top;

    public StackArray() {
        this.stack = new Object[100];
        this.top = 0;
    }

    @Override
    public boolean push(Object value) {
        if (isEmpty()) {
            this.stack[top] = value;
            return true;
        } else {
            if (size() == stack.length) {
                System.out.println("Overflow");
                Object[] aux = new Object[stack.length * 2];
                for (int i = 0; i < stack.length; i++) {
                    aux[i] = stack[i];
                }
                stack = aux;
            }
            top++;
            this.stack[top] = value;
            return true;
        }

    }

    @Override
    public Object pop(){
        Object onTop = this.stack[top];
        this.stack[top] = null;
        if (top > 0) {
            top--;
        }
        return onTop;
    }

    @Override
    public Object top() {
        return this.stack[top];
    }

    @Override
    public boolean isEmpty() {
        if (top == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        if (top == 0 && this.stack[top] != null) {
            return 1;
        } else {
            return top;
        }
    }
    
    
}
