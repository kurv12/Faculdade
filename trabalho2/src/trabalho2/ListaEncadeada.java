package trabalho2;

/**
 *
 * @author keven costa
 */
public class ListaEncadeada implements Lista {

    Node head;

    //Obtem item em uma posição
    @Override
    public Object peek(int pos) {
        int count = 0;
        Node aux;
        if (pos == 1) {
            return head.getItem();
        } else if (pos > 1 && pos <= size()) {
            aux = head;
            while (count < pos - 1) {
                aux = aux.getNext();
                count++;
            }
            return aux.getItem();
        } else {
            return null;
        }
    }

    //Insere item em uma posição
    @Override
    public boolean insert(int pos, Object obj) {
        if (contains(obj)) {
            System.out.println("Já contém este objeto!");
            return false;
        } else {
            Node novoNo = new Node(obj), aux;
            int count = 0;

            if (pos == 0) {
                return insert(obj);
            } else if (pos > 0 && pos <= size() - 1) {
                aux = head;
                while (count < pos - 1) {
                    aux = aux.getNext();
                    count++;
                }
                novoNo.setNext(aux.getNext());
                aux.setNext(novoNo);
                return true;
            } else {
                return false;
            }
        }
    }

    //insere objeto no topo
    @Override
    public boolean insert(Object obj) {
        if (contains(obj)) {
            System.out.println("Já contém este objeto!");
            return false;
        } else {
            Node novoNo = new Node(obj);
            novoNo.setNext(head);
            head = novoNo;
            return true;
        }
    }

    //Remove elemento de determinada posição
    @Override
    public boolean remove(int pos) {
        int count = 1;
        Node aux;

        if (pos == 0 || pos == 1) {
            head = head.getNext();
        } else if (pos > 1 && pos <= size()) {
            aux = head;
            while (count < pos - 1) {
                aux = aux.getNext();
                count++;
            }
            Node aux1 = aux.getNext();
            if (aux1.getNext() != null) {
                aux.setNext(aux1.getNext());
            } else {
                aux.setNext(null);
            }
            return true;
        }
        return false;

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

    //Remove objeto do começo da lista
    @Override
    public Object remove() {
        Node aux = head;
        head = head.getNext();
        return aux.getItem();
    }

    //Insere na ultima posição
    @Override
    public boolean insertLast(Object obj) {
        if (contains(obj)) {
            System.out.println("Já contém este objeto!");
            return false;
        } else {
            Node novoNo = new Node(obj);
            Node aux = head;

            if (!isEmpty()) {
                while (aux.getNext() != null) {
                    aux = aux.getNext();
                }
                aux.setNext(novoNo);
                return true;
            } else {
                return false;
            }
        }
    }

    //Remove o ultimo da lista
    @Override
    public Object removeLast() {
        Node aux = head;
        Node aux1 = head.getNext();

        if (!isEmpty()) {
            while (aux1.getNext() != null) {
                aux = aux.getNext();
                aux1 = aux1.getNext();
            }
            aux.setNext(null);
        }
        return aux;
    }

//    //Ordenação da lista com QuickSort
    @Override
    public void sort() {
//        int inicio = 0;
//        int fim = size();
//        quicksort(inicio, fim);
//    }
//    
//    public void quicksort(int inicio, int fim){
//        int i = separar(inicio, fim);
//        if(inicio < i -1)
//            quicksort(inicio, i -1);
//        if(i < fim)
//            quicksort(i, fim);
//        
    }

    
    //Inversão da lista
    @Override
    public void invert() {
        Node aux = head;
        Node headinvert = new Node();
        headinvert.setItem(aux.getItem());
        int count = 0;
        while (count < size() - 1) {
            aux = aux.getNext();
            Node aux2 = new Node();
            aux2.setItem(aux.getItem());
            aux2.setNext(headinvert);
            headinvert = aux2;
            count++;
        }
        head = headinvert;
    }

    //Retorna primeira metade da lista
    @Override
    public Lista getFirstHalf() {
        ListaEncadeada firsthalf = new ListaEncadeada();
        Node aux = head;
        firsthalf.insert(aux.getItem());
        int count = 0;
        
        while(count < (size()-1)/2){
            aux = aux.getNext();
            firsthalf.insertLast(aux.getItem());
            count++;
        }
        
        return firsthalf;
    }

    //Retorna segunda metade da lista
    @Override
    public Lista getSecondHalf() {
        Node aux = head;
        ListaEncadeada secondhalf = new ListaEncadeada();
        int count = 0;
        
        //Percorro até a metade
        while(count < size()/2){
            aux = aux.getNext();
            count++;
        }
        
        //Salvo primeira prosição da segunda metade
        secondhalf.insert(aux.getItem());
        //Salvo o resto da segunda metade
        while(aux.getNext() != null){
            aux = aux.getNext();
            secondhalf.insertLast(aux.getItem());
        }

        return secondhalf;
    }

    //Verifica se contem
    @Override
    public boolean contains(Object obj) {
        int count = 0;
        Node aux;
        boolean contain = false;

        if (!isEmpty()) {
            aux = head;
            while (count < size()) {
                if (aux.getItem().equals(obj)) {
                    contain = true;
                }
                aux = aux.getNext();
                count++;
            }
        }
        return contain;
    }

    @Override
    public String toString() {
        Node aux = head;
        int count = 0;
        String resultado = "Lista = ";
        while (count < size()) {
            resultado = resultado + " " + aux.getItem();
            aux = aux.getNext();
            count++;
        }
        return resultado;
    }

}
