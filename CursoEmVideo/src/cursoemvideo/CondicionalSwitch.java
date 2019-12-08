
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Keven
 */
public class CondicionalSwitch {
    public static void main(String[] args){
        Scanner cond = new Scanner(System.in);
        System.out.println("Quantas pernas?");
        int perna = cond.nextInt();
        String tipo;
        System.out.print("Isso é um(a)");
        switch(perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bidepede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6:
                tipo = "Arac need you";
                break;
            default:
                tipo = "ET";
                break;
            
        }
        System.out.println(tipo);
    }
    
}
