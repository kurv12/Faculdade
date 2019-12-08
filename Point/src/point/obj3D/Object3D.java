/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point.obj3D;

import java.awt.Color;
import java.util.ArrayList;

public class Object3D {
    protected Color color;
    ArrayList ponto = new ArrayList();
    ArrayList face = new ArrayList();
    
    public Color getColor(){
        return color;
    }
    public void setColor(Color color){
        this.color = color; 
    }
}
