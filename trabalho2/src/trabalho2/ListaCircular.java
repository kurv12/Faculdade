/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;

/**
 *
 * @author Keven Costa
 */
public class ListaCircular implements Lista {

    Node head;
    int size;

    //Insere em determinada posição
    @Override
    public boolean insert(int pos, Object obj) {
        if (contains(obj)) {
            System.out.println("Já contém este objeto!");
            return false;
        } else {

            Node novoNo = new Node(obj), aux = head;
            int count = 0;

            if (pos == 0) {
                return insert(obj);
            } else if (pos > 0 && pos < size() - 1) {
                while (count < pos - 1) {
                    aux = aux.getNext();
                    count++;
                }
                novoNo.setNext(aux.getNext());
                aux.setNext(novoNo);
                size++;
                return true;
            } else if (pos == size() - 1) {
                insertLast(obj);
                return true;
            } else {
                return false;
            }
        }
    }

    //Insere na cabeça ou topo
    @Override
    public boolean insert(Object obj) {
        if (contains(obj)) {
            System.out.println("Já contém este objeto!");
            return false;
        } else {
            Node novoNo = new Node(obj);
            novoNo.setNext(head);
            head = novoNo;
            size++;
            return true;
        }
    }

    //Insere na ultima posição
    @Override
    public boolean insertLast(Object obj) {
        if (contains(obj)) {
            System.out.println("Já contém este objeto!");
            return false;
        } else if (!isEmpty()) {
            Node novoNo = new Node(obj);
            Node aux = head;

            if (size() == 1) {
                head.setNext(novoNo);
                return true;
            } else {
                int count = 0;
                while (count < size()) {
                    aux = aux.getNext();
                    count++;
                }
                aux.setNext(novoNo);
                novoNo.setNext(head);
                size++;
                return true;
            }
        } else {
            return insert(obj);
        }
    }

    //Remove em uma determinada posição
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
            aux.setNext(aux1.getNext());
            size--;
            return true;
        }
        return false;
    }

    //remove o ultimo da lista
    @Override
    public Object removeLast() {
        Node aux = head;
        Node aux1 = head.getNext();
        int count = 0;

        if (!isEmpty()) {
            while (count < size() - 1) {
                aux = aux.getNext();
                aux1 = aux1.getNext();
                count++;
            }
            aux.setNext(head);
            size--;
        }
        return aux;
    }

    //Remove do topo da lista
    @Override
    public Object remove() {
        Node aux = head;
        head = head.getNext();
        size--;
        return aux.getItem();
    }

    //Verifica se está vazio;
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    //Calcula tamanho da lista
    @Override
    public int size() {
        return this.size;
    }

    //Retorna um item em posição especifica
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

    //Ordena lista
    @Override
    public void sort() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Inverte lista circular
    @Override
    public void invert() {
        Node aux = head;
        Node headinvert = new Node();
        headinvert.setItem(aux.getItem());
        headinvert.setNext(head);
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
        ListaCircular firsthalf = new ListaCircular();
        Node aux = head;
        firsthalf.insert(aux.getItem());
        int count = 0;

        while (count < (size() - 1) / 2) {
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
        ListaCircular secondhalf = new ListaCircular();
        int count = 0;

        //Percorro até a metade
        while (count < size() / 2) {
            aux = aux.getNext();
            count++;
        }

        //Salvo primeira prosição da segunda metade
        secondhalf.insert(aux.getItem());
        //Salvo o resto da segunda metade
        count = 0;
        while (count < size()) {
            aux = aux.getNext();
            secondhalf.insertLast(aux.getItem());
        }

        return secondhalf;
    }

    //Vê se contem objeto
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

    //Imprime lista
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
