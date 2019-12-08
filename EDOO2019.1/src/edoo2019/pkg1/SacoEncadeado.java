/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edoo2019.pkg1;

import java.util.Iterator;

/**
 *
 * @author Keven
 */
public class SacoEncadeado<T> implements Saco<T> {

    /**
     * Número de elementos no saco.
     */
    private int n;

    /**
     * Referência para o primeiro nó da lista encadeada.
     */
    private No<T> primeiro;

    /**
     * Construtor padrão: constrói uma lista vazia.
     */
    public SacoEncadeado() {
        this.primeiro = null;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterador();
    }

    @Override
    public void insere(T item) {
        primeiro = new No<T>(item, primeiro);
        ++n;
    }

    @Override
    public boolean vazio() {
        return primeiro == null;
    }

    @Override
    public int tamanho() {
        return n;
    }

    private class Iterador implements Iterator<T> {

        /**
         * Índice do item atual.
         */
        private int i;
        
        private No<T> aux;
        
        /**
         * Inicializa o iterator no início do array.
         */
        public Iterador() {
            this.i = 0;
            this.aux = primeiro;
        }

        @Override
        public boolean hasNext() {
            return i < n;
        }

        @Override
        public T next() {
            if(i == 0){
                i++;
                return aux.getInfo();
            }
            i++;
            aux = aux.getProx();
            return aux.getInfo();
        }

    }

}
