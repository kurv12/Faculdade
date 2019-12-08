package edoo2019.pkg1;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Keven
 * @param <K>
 * @param <V>
 */
public class TSArvoreBinariaBusca<K extends Comparable<K>, V> implements TS<K, V> {

    /**
     * Nó raiz.
     */
    private NoBin<TSItem<K, V>> raiz;

    /**
     * Número de nós na árvore.
     */
    private int tamanho;

    /**
     * Cria uma ABB vazia.
     */
    public TSArvoreBinariaBusca() {
        raiz = null;
        tamanho = 0;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public boolean vazia() {
        return raiz == null;
    }

    @Override
    public boolean contem(K chave) {
        return get(chave) != null;
    }

    @Override
    public V get(K chave) {
        /*
		 * Esta é uma implementação RECURSIVA do algoritmo de busca.
         */
        return get(raiz, chave);
    }

    /**
     * Implementação RECURSIVA da operação get(chave).
     *
     * Busca a chave dada na sub-árvore cuja raiz é o nó dado e retorna o valor
     * associado a esta chave (ou null caso a chave não esteja nesta
     * sub-árvore).
     *
     * @param n
     * @param chave
     * @return
     */
    private V get(NoBin<TSItem<K, V>> n, K chave) {
        if (n == null) // Sub-árvore é vazia.
        {
            return null;
        }

        int comp = chave.compareTo(n.info.getChave());

        if (comp == 0) // Chave está no nó raiz desta sub-árvore.
        {
            return n.info.getValor();
        }

        if (comp < 0) // Chave está na sub-árvore esquerda.
        {
            return get(n.esq, chave);
        }

        // Chave está na sub-árvore direita.
        return get(n.dir, chave);
    }

    @Override
    public void put(K chave, V valor) {
        /*
		 * Implementação RECURSIVA da operação put(chave, valor).
         */
        raiz = put(raiz, chave, valor);
    }

    /**
     * Implementação RECURSIVA da operação put(chave, valor).
     *
     * Este método retorna um nó para tratar o caso da inserção de uma nova
     * chave.
     *
     * @param n
     * @param chave
     * @param valor
     * @return
     */
    private NoBin<TSItem<K, V>> put(NoBin<TSItem<K, V>> n, K chave, V valor) {
        if (n == null) {
            ++tamanho;
            return new NoBin<>(new TSItem<>(chave, valor));
        }

        int comp = chave.compareTo(n.info.getChave());

        if (comp == 0) {
            n.info.setValor(valor);
        } else if (comp < 0) {
            n.esq = put(n.esq, chave, valor);
        } else {
            n.dir = put(n.dir, chave, valor);
        }

        return n;
    }

    @Override
    public void remove(K chave) {
        if (raiz == null) {
            return;
        }

        int comp = chave.compareTo(raiz.info.getChave());
        if (comp == 0) {
            // Chave está na raiz da árvore.
            raiz = removeRaiz(raiz);
            --tamanho;
            return;
        }

        NoBin<TSItem<K, V>> p = raiz;
        NoBin<TSItem<K, V>> n;

        if (comp < 0) {
            n = raiz.esq;
        } else {
            n = raiz.dir;
        }

        while (n != null) {
            comp = chave.compareTo(n.info.getChave());
            if (comp == 0) {
                if (n == p.esq) {
                    p.esq = removeRaiz(n);
                } else {
                    p.dir = removeRaiz(n);
                }
                --tamanho;
                return;
            }

            p = n;
            if (comp < 0) {
                n = n.esq;
            } else {
                n = n.dir;
            }

        }
    }

    private NoBin<TSItem<K, V>> removeRaiz(NoBin<TSItem<K, V>> n) {
        if (n.esq == null) {
            return n.dir;
        }
        if (n.dir == null) {
            return n.esq;
        }
        NoBin<TSItem<K, V>> p = null;
        NoBin<TSItem<K, V>> q = n.dir;
        while (q.esq != null) {
            p = q;
            q = q.esq;
        }

        if (p != n) {
            p.esq = q.dir;
            q.esq = n.esq;
        }
        q.esq = n.esq;

        return q;
    }

    public void exibeDeitada() {
        if (raiz == null) {
            return;
        }
        if (raiz.dir != null) {
            exibeDeitada(raiz.dir, true, "");
            System.out.println("|  ");
        }

        System.out.println(raiz.info);

        if (raiz.esq != null) {
            System.out.println("|  ");
            exibeDeitada(raiz.esq, false, "");
        }

        System.out.println();
    }

    public void exibeDeitada(NoBin<TSItem<K, V>> n, boolean dir, String ident) {
        // Calcula identação da sub-árvore direita de n.
        if (n.dir != null) {
            String dirIdent;
            if (dir) {
                dirIdent = ident + "   ";
            } else {
                dirIdent = ident + "|  ";
            }

            exibeDeitada(n.dir, true, dirIdent);

            System.out.println(dirIdent + "|");
        }

        // Exibe raiz.
        System.out.printf("%s+--%s\n", ident, n.info);

        if (n.esq != null) {
            String esqIdent;
            if (dir) {
                esqIdent = ident + "|  ";
            } else {
                esqIdent = ident + "   ";
            }

            System.out.println(esqIdent + "|");

            exibeDeitada(n.esq, false, esqIdent);
        }
    }

//    private NoBin<TSItem<K, V>> put(NoBin<TSItem<K, V>> n, K chave, V valor){
//        if(n == null){
//            tamanho++;
//            return new NoBin<TSItem<K, V>>(chave, valor);
//        }
//        int cmp = chave.compareTo(n.info.chave);
//        if(cmp == 0){
//            n.info.setValor(valor);
//            return n;
//        }
//        if(cmp < 0)
//            n.esq = put(n.esq, chave, valor);
//        return n;
//    }
    /**
     * Exibe os itens da árvore.
     */
    public void exibe() {
        exibe(raiz);
    }

    /**
     * Algoritmo recursivo para exibir os itens da árvore.
     *
     * @param n
     */
    public void exibe(NoBin<TSItem<K, V>> n) {
        if (n == null) {
            return;
        }
        exibe(n.esq);
        System.out.printf("(%s,%s)\n", n.info.getChave(), n.info.getValor());
        exibe(n.dir);
    }

    public K min() {
        if (raiz == null) {
            return null;
        }
        NoBin<TSItem<K, V>> n = raiz;
        while (n.esq != null) {
            n = n.esq;
        }
        return n.info.getChave();
    }
    
    public K maxIterativo() {
        if (raiz == null) {
            return null;
        }
        NoBin<TSItem<K, V>> n = raiz;
        while (n.dir != null) {
            n = n.dir;
        }
        return n.info.getChave();
    }
    
    public K max(){
        if (raiz == null) {
            return null;
        }
        return maxRecursivo(raiz);
    }
    public K maxRecursivo(NoBin<TSItem<K, V>> n) {
        if(n.dir == null)
            return n.info.getChave();
        return maxRecursivo(n.dir);
    }

    public int altura() {
        NoBin<TSItem<K, V>> n = raiz;
        return altura(n);
    }

    public int altura(NoBin<TSItem<K, V>> n) {
        if (n == null) {
            return -1;
        }
        int he = altura(n.dir);
        int hb = altura(n.esq);
        if (he > hb) {
            return 1 + he;
        } else {
            return 1 + hb;
        }
    }

    public void exibeIntervalo(K a, K b) {
        if (raiz == null) {
            System.out.println("Não existe");
        }
        
        exibeIntervalo(a);
        exibeIntervalo(b);
    }
    
    public void exibeIntervalo(K chave){
        int comp = chave.compareTo(raiz.info.getChave());
        if (comp == 0) {
            exibe();
        }
        
        NoBin<TSItem<K, V>> p = raiz;
        NoBin<TSItem<K, V>> n;

        if (comp < 0) {
            n = raiz.esq;
        } else {
            n = raiz.dir;
        }

        while (n != null) {
            if(n.equals(chave)){
                exibe(n.dir);
            }            
        }

    }

    @Override
    public Iterator<K> iterator() {
        return new Iterador(raiz);
    }

    /**
     * Iterador que percorre as chaves da árvore em ordem.
     *
     * @author Eraldo R. Fernandes (eraldo@facom.ufms.br)
     *
     */
    private class Iterador implements Iterator<K> {

        /**
         * Pilha usada para armazenar os nós acessados mas ainda não visitados
         * (está visitando a sub-árvore esquerda).
         */
        private Deque<NoBin<TSItem<K, V>>> pilha;

        /**
         * Nó atual.
         */
        private NoBin<TSItem<K, V>> noAtual;

        /**
         * Cria um iterador para a árvore cuja raiz é n.
         *
         * @param n
         */
        public Iterador(NoBin<TSItem<K, V>> n) {
            pilha = new LinkedList<>();
            passo(n);
        }

        @Override
        public boolean hasNext() {
            return noAtual != null || !pilha.isEmpty();
        }

        @Override
        public K next() {
            NoBin<TSItem<K, V>> topo = pilha.pop();
            passo(topo.dir);
            return topo.info.getChave();
        }

        /**
         * Segue sempre à esquerda até chegar em um nó que não tem filho
         * esquerdo.
         *
         * @param n
         */
        private void passo(NoBin<TSItem<K, V>> n) {
            noAtual = n;
            while (noAtual != null) {
                pilha.push(noAtual);
                noAtual = noAtual.esq;
            }
        }

    }

}
