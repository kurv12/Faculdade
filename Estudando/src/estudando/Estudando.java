/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudando;

import java.util.Scanner;

/**
 *
 * @author Keven
 */
public class Estudando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int A = ler.nextInt();
        int B = ler.nextInt();
        int C = ler.nextInt();
        int D = ler.nextInt();
        int resultado = ((A*B)-(C*D));
        System.out.println("DIFERENCA = " + resultado);
    }

}
