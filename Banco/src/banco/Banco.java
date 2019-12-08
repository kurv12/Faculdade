/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author Keven
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Conta p1 = new Conta();
        p1.setNumConta(1111);
        p1.setDono("Fernando");
        p1.abrirConta("cc");
        p1.estadoAtual();
        
        
        
        
        
    }
    
}
