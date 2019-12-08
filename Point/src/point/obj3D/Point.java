/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point.obj3D;

/**
 *
 * @author Keven
 */
public class Point {

    protected double x,y,z;
    public Point(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public Point(String x, String y, String z){
        this.x = new Double(x);
        this.y = new Double(y);
        this.z = new Double(z);
    }
    
    public void setPoint(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public double[] getPoint(){
        double[] vet = {x,y,z};
        return vet;
    }
}
