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
public class Exercicio7 {
    public int maiorMatriz(int [][] matriz, int i){
        if(i > matriz.length - 1)
            return 0;
        return maiorMatriz(matriz, i, matriz.length -1, 0);
    }
    
    public int maiorMatriz(int [][] matriz, int i, int f, int c){
        if(i == f){
            return matriz[i][c];
        }else{
            int n1, n2;
            int meio;
            
            meio = (i + f)/2;
            n1 = maiorMatriz(matriz, i, meio, 0);
            n2 = maiorMatriz(matriz, meio+1, f, 0);
            
            if(n1 > n2)
                return n1;
            return n2;
        }    
    }
}
