/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4;

/**
 *
 * @author Keven
 */
public class Exercicio6 {
    public int maiorVetor(int [] vetor, int i){
        if(i > vetor.length - 1)
            return 0;
        return maiorVetor(vetor, i, vetor.length -1);
    }
    
    public int maiorVetor(int [] vetor, int i, int f){
        if(i == f){
            return vetor[i];
        }else{
            int n1, n2;
            int meio;
            
            meio = (i + f)/2;
            n1 = maiorVetor(vetor, i, meio);
            n2 = maiorVetor(vetor, meio+1, f);
            
            if(n1 > n2)
                return n1;
            return n2;
        }    
    }
    
}
