/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2lista3;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 *
 * @author Keven
 */
public class ColeçãoDeCartas implements Iterator {
    private final int []cartas = {2,3,4,5,6,7,8,9,10};
    int i = -1;
    
    @Override
    public boolean hasNext() {
        return i < cartas.length -1;
    }

    @Override
    public Object next() {
        if(i == cartas.length -1){
            i = -1;
            i++;
            return cartas[i];
        }else{
            i++;
            return cartas[i];
        }
    }
}
