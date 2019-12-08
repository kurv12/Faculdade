/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tadjava;

/**
 *
 * @author Keven
 */
public class MetodoMax {
    public float max(SacolaFloat s){
        float max = Float.NEGATIVE_INFINITY;
        int n = s.tamanho();
        for(int i = 0;i<n;++i ){
            float item = s.get(i);
            if(item>max){
                max = item;
            }
        }
        return max;
    }
}
