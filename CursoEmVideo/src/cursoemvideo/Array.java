/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoemvideo;

import java.util.Arrays;

/**
 *
 * @author Keven
 */
public class Array {
    public static void main(String[] args){
        double v[]={3.5, 2.75, 9, -4.5};
        Arrays.sort(v);//ordena os números no vetor
        for(double valor: v){
            System.out.print(valor + " ");
        }
    }
}
