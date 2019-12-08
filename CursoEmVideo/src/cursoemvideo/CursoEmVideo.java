/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoemvideo;

import java.util.Scanner;

/**
 *
 * @author Keven
 */
public class CursoEmVideo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int nasc = ler.nextInt();
        int i = 2017 - nasc;
        if (i<16){
            System.out.println("Não vota!");
        }else{
            if((i>=16 && i<18)||(i>70)){
                System.out.println("Opcional");
            }else{
                 System.out.println("Voto obrigatório!");   
            }
        }
    }
    
}
