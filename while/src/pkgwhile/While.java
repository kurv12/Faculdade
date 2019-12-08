/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Keven
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int produto =0;
        int n1, n2, cont;
        System.out.println("Me fale quantas vezes quer somar?");
        n1 = ler.nextInt();
        System.out.println("Com quanto quer somar?");
        n2 = ler.nextInt();
        
        cont = 0;
        
        while(cont<n1){
            produto += n2;
            System.out.println(produto);
            cont++;
        }
    }
    
    
}
