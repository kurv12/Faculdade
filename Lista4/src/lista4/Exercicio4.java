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
public class Exercicio4 {
    public boolean palindromo (String palavra){
        return palindromo(palavra, 0, palavra.length() -1);
    }
    
    public boolean palindromo(String palavra, int inicio, int fim){
        if(inicio == fim || inicio > fim){
            return true;
        }else if(palavra.charAt(fim)== palavra.charAt(inicio)){
            return palindromo(palavra, inicio++, fim--);
        }else{
            return false;
        }
    }
}
