/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri2;

import java.util.Scanner;

/**
 *
 * @author Keven
 */
public class Uri2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float A, B , C, media;
        Scanner leitor = new Scanner(System.in);
        
        A = leitor.nextFloat();
        B = leitor.nextFloat();
        C = leitor.nextFloat();
        
        media = (float) (((A*2)+(B*3)+(C*5))/10);
        
        System.out.println("MEDIA = " + media);
        
    }
    
}
