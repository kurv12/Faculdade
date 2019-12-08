/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

import java.util.Scanner;

/**
 *
 * @author Keven
 */
public class Uri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//1006
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();//peso 2
        double B = leitor.nextDouble();//peso 3
        double C = leitor.nextDouble();//peso 5
        double MEDIA = leitor.nextDouble();
        
        MEDIA = (A*0.2)+(B*0.3)+(C*0.5);
        
        System.out.printf("MEDIA = %1.1lf \n",+MEDIA);
        
    }
    
}
