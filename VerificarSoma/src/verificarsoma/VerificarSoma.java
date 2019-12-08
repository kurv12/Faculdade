/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificarsoma;

import java.util.Scanner;

/**
 *
 * @author Keven
 */
public class VerificarSoma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int s[] = {3, 41, 52, 26, 38, 57, 9, 49};
        System.out.println("Qual a soma?");
        int x = ler.nextInt();
        procurasoma(s,x);
    }
    public static void procurasoma(int s[], int x){
        int j = s.length;
        int i = 0;
        int meio = s.length/2;
        int aux = s.length/2;
        int soma;
        while(i<aux && meio<j-1){
                     
            soma = s[i]+s[meio];//faz a soma do conteúdo do vetor
            
            if(soma == x){//verifica se for igual
                System.out.printf("A posição %d e a posição %d somados equivale a %d \n", i, meio, x);
                
            }
            i++;
            meio++;
            
        }
        
    }
}
