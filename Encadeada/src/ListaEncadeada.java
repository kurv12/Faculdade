/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 201819070174
 */
public class ListaEncadeada implements Lista {

    Node head;

    public void trocarElementos(int pos1, int pos2) {
        Node aux = new Node();
        Node aux2 = new Node(get(pos2));
        Node aux3 = new Node(get(pos1));
        int count = 0;

        if (pos1 > 0 && pos1 <= size()) {
            aux = head;
            while (count < pos1 - 1) {
                aux = aux.getNext();
                count++;
            }
            aux2.setItem(aux.getItem());//coloquei a pos1 em aux2
        }

        count = 0;
        if (pos2 > 0 && pos2 <= size()) {
            aux = head;
            while (count < pos2 - 1) {
                aux = aux.getNext();
                count++;
            }
            aux3.setItem(aux.getItem());//coloquei pos2 em aux3
        }

        aux.setItem(aux2.getItem());//objeto do aux2 em aux
        aux2.setItem(aux3.getItem());//objeto do aux 3 em aux2
        aux3.setItem(aux.getItem());//objeto do aux em aux3

    }

    public void inverteLista() {
        Node aux = new Node();
        Node aux2 = new Node();
        Node aux3 = new Node();
        Node ultimo = new Node();
        int i = 0;
        int j = size();
        int count = 0;
        int tamanho = size();
        
        ultimo = head;
        aux = head;
        while (i < size() - 1) {
            while(count < tamanho){
                ultimo = ultimo.getNext();
                count++;
            }
            aux = aux.getNext();
            aux.setItem(ultimo.getItem());
            ultimo.setItem(aux2.getItem());
            aux2.setItem(aux.getItem());
        }

    }

    @Override
    public Object get(int pos) {
        int count = 0;
        Node aux;
        if (pos == 0) {
            return head.getItem();
        } else if (pos > 0 && pos <= size()) {
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

    @Override
    public boolean add(int pos, Object item) {
        Node novoNo = new Node(item), aux;
        int count = 0;

        if (pos == 0) {
            return add(item);
        } else if (pos > 0 && pos <= size()) {
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

    @Override
    public boolean add(Object item) {
        Node novoNo = new Node(item);
        novoNo.setNext(head);
        head = novoNo;
        return true;
    }

    @Override
    public boolean remove(int pos) {
        int count = 0;
        Node aux;

        if (pos == 0) {
            head = head.getNext();
        } else if (pos >= 0 && pos <= size() - 1) {
            aux = head;
            while (count < pos) {
                aux = aux.getNext();
                count++;
            }
            aux = aux.getNext();
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
        if (head != null) {
            aux = head;
            tamanho = 1;
            while (aux.getNext() != null) {
                aux = aux.getNext();
                tamanho++;
            }
        }
        return tamanho;
    }

}
