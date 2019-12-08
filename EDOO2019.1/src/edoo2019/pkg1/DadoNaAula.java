/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Keven
 */
public class DadoNaAula {
    public void out(K chave, V valor){
        raiz = put(raiz, chave, valor);
    }
    
    private No<> put(No<> n, K chave, V valor){
        if(n == null){
            tamanho++;
            return new No<>(chave, valor);
        }
        int cmp = chave.compareTo(n.info.chave);
        if(cmp == 0){
            n.info.setValor(valor);
            return n;
        }
        if(cmp < 0)
            n.esq = put(n.esq, chave, valor);
        return n;
    }
}
