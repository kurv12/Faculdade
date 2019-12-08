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
public class ListaDuplamenteEncadeada implements Lista {

    DoubleLinkedNode head;
    int size;

    //Insere em determinada posição
    @Override
    public boolean insert(int pos, Object obj) {
        if (contains(obj)) {
            System.out.println("Já contém este objeto!");
            return false;
        } else {
            DoubleLinkedNode novoNo = new DoubleLinkedNode(obj), aux, aux2;
            int count = 0;

            if (pos == 0) {
                return insert(obj);
            } else if (pos > 0 && pos <= size() - 1) {
                aux = head;
                while (count < pos - 1) {
                    aux = aux.getNext();
                    count++;
                }
                aux2 = aux.getNext();                  //No que auxiliar aponta
                novoNo.setNext(aux2);                //novo no aponta para nó depois do auxiliar
                novoNo.setPrev(aux);                //novo no aponta pro anterior
                aux.setNext(novoNo);                //auxiliar aponta para novo no
                aux2.setPrev(novoNo);
                size++;
                return true;
            } else {
                return false;
            }
        }
    }

    //Insere no topo da lista
    @Override
    public boolean insert(Object obj) {
        if (contains(obj)) {
            System.out.println("Já contém este objeto!");
            return false;
        } else if(isEmpty()){
            DoubleLinkedNode novoNo = new DoubleLinkedNode(obj, head);
            head = novoNo;
            size++;
            return true;
        } else{
            DoubleLinkedNode novoNo = new DoubleLinkedNode(obj, head), aux;
            head = novoNo;
            aux = head.getNext();
            aux.setPrev(head);
            size++;
            return true;
        }
    }

    //Insere no fim da lista
    @Override
    public boolean insertLast(Object obj) {
        if (contains(obj)) {
            System.out.println("Já contém este objeto!");
            return false;
        } else {
            DoubleLinkedNode novoNo = new DoubleLinkedNode(obj);
            DoubleLinkedNode aux = head;

            if (!isEmpty()) {
                while (aux.getNext() != null) {
                    aux = aux.getNext();
                }
                aux.setNext(novoNo);
                novoNo.setPrev(aux);
                size++;
                return true;
            } else {
                return false;
            }
        }
    }

    //remove em determinada posição
    @Override
    public boolean remove(int pos) {
        int count = 1;
        DoubleLinkedNode aux;

        if (pos == 0 || pos == 1) {
            head = head.getNext();
            head.setPrev(null);
            size--;
        } else if (pos > 1 && pos <= size()) {
            aux = head;
            while (count < pos - 1) {
                aux = aux.getNext();
                count++;
            }
            DoubleLinkedNode aux1 = aux.getNext();
            if (aux1.getNext() != null) {
                aux1 = aux1.getNext();
                aux.setNext(aux1);
                aux1.setPrev(aux);
            } else {
                aux.setNext(null);
            }
            size--;
            return true;
        }
        return false;
    }

    //Remove o ultimo da lista
    @Override
    public Object removeLast() {
        DoubleLinkedNode aux = head;

        if (!isEmpty()) {
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux = aux.getPrev();
            aux.setNext(null);
            size--;
        }
        return aux;
    }

    //Remove no começo da lista
    @Override
    public Object remove() {
        if (!isEmpty()) {
            DoubleLinkedNode aux = head;
            head = head.getNext();
            head.setPrev(null);
            size--;
            return aux.getItem();
        }else{
            return null;
        }
    }

    //Retorna verdadeiro ou falso se estiver vazio
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    //Retorna tamanho da lista
    @Override
    public int size() {
        return this.size;
    }

    //Retorna um valor especifico
    @Override
    public Object peek(int pos) {
        int count = 0;
        DoubleLinkedNode aux;
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

    //Ordena lista com margeSort
    @Override
    public void sort() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Inverte lista duplamente encadeada
    @Override
    public void invert() {
        DoubleLinkedNode aux = head;
        DoubleLinkedNode headinvert = new DoubleLinkedNode();
        headinvert.setItem(aux.getItem());
        int count = 0;
        while (count < size() - 1) {
            aux = aux.getNext();
            DoubleLinkedNode aux2 = new DoubleLinkedNode();
            aux2.setItem(aux.getItem());
            aux2.setNext(headinvert);
            headinvert.setPrev(aux2);
            headinvert = aux2;
            count++;
        }
        head = headinvert;
    }

    //Retorna primeira metade da lista
    @Override
    public Lista getFirstHalf() {
        ListaDuplamenteEncadeada firsthalf = new ListaDuplamenteEncadeada();
        DoubleLinkedNode aux = head;
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
        DoubleLinkedNode aux = head;
        ListaDuplamenteEncadeada secondhalf = new ListaDuplamenteEncadeada();
        int count = 0;

        //Percorro até a metade
        while (count < size() / 2) {
            aux = aux.getNext();
            count++;
        }

        //Salvo primeira prosição da segunda metade
        secondhalf.insert(aux.getItem());
        //Salvo o resto da segunda metade
        while (aux.getNext() != null) {
            aux = aux.getNext();
            secondhalf.insertLast(aux.getItem());
        }

        return secondhalf;
    }

    //Verifica se contém na lista
    @Override
    public boolean contains(Object obj) {
        int count = 0;
        DoubleLinkedNode aux;
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
        DoubleLinkedNode aux = head;
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
