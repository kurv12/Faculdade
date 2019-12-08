/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivo;

import java.util.Arrays;

/**
 *
 * @author Keven
 */
public class Recursivo {

    /**
     * @param args the command line arguments
     */
    void regua(int ini, int fim, int alt){
        char[] str;
        if(alt>0){
            str = new char[alt];
            int meio = (ini+fim)/2;
            Arrays.fill(str,"-");
            
            System.out.printf("%d %d\n", new String(str),meio);
            
            regua(ini, meio, alt-1);
            regua(meio, fim, alt-1);
        }
    }
    public static void main(String[] args) {
        Recursivo r = new Recursivo();
        
        r.regua(0, 8, 3);
    }
    
}
