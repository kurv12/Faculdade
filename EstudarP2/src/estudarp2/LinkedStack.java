package estudarp2;

public class LinkedStack implements Stack {

    Node head;

    public LinkedStack() {
        head = null;
    }

    @Override
    public boolean push(Object value) {
        if (!isEmpty()) {
            Node novoNo = new Node(value);
            head = novoNo;
        } else {
            Node NovoNo = new Node(value);
            head = NovoNo;
        }
        return true;
    }

    @Override
    public Object pop() {
        if (!isEmpty()) {
            head = head.getNext();
        }
        return head;
    }

    @Override
    public Object top() {
        return head;

    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        int tamanho = 0;
        Node aux;
        if (!isEmpty()) {
            aux = head;
            tamanho = 1;
            while (aux.getNext() != null) {
                aux = aux.getNext();
                tamanho++;
            }
        }
        return tamanho;
    }

    public boolean bemFormada(String sequencia, Stack pilha) {

        return false;
    }

    public String inverte(String palavra, Stack pilha) {
        if (palavra.length() == 0) {
            return imprime(pilha);
        } else {
            Object charac = palavra.charAt(0);
            pilha.push(charac);
            return inverte(palavra.substring(0), pilha);
        }
    }

    public String imprime(Stack pilha) {
        if (pilha.isEmpty()) {
            return null;
        } else {
            System.out.println(pilha.pop());
            return imprime(pilha);
        }
    }
}
