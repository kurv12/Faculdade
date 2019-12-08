/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exuri;

import java.util.Scanner;

/**
 *
 * @author Keven
 */
public class ExUri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = 3.14159 * Math.pow(a, 2);

        System.out.printf("A=%.4f%n" , b);
        scan.close();
    }

    
}
