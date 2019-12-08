/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point.obj3D;

import java.util.ArrayList;

public class Cena {
    private ArrayList lista = new ArrayList();
    private double escala=1;
    
    public void add(Object3D obj){
        lista.add(obj);
    }
    public void clear(){
        lista.clear();
    }

    public ArrayList getEscala() {
        return escala;
    }
    public void setEscala(double escala) {
        this.escala = escala;
    }
    
    
}
