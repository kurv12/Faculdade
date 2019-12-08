/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4;

/**
 *
 * @author Keven
 */
public class Exercicio5 {
    public void decBin(int n){
        if(n == 1){
             System.out.print(1);
        }else{
            decBin(n/2);
            System.out.print(n%2);
        }
    }
}
