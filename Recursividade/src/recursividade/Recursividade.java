/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade;

import java.util.Scanner;

/**
 *
 * @author Keven
 */
public class Recursividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o número base: ");
        double x = ler.nextDouble();
        System.out.println("Insira o expôente: ");
        int n = ler.nextInt();
        
        int resul = potR(x, n);
        System.out.println(resul);
       
    }
   public static int potR (double x, int n){
        if(n==0){
            return 1;
        }else{
            return (int) (x*potR(x,n-1));
        }
    }
}
