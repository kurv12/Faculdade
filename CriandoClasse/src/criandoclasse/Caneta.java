/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criandoclasse;

/**
 *
 * @author Keven
 */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    public void status(){
        System.out.println(this.modelo);
        System.out.println(this.cor);
        System.out.println(this.ponta);
        System.out.println(this.carga);
        System.out.println(this.tampada);
    }
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Não da pra rabiscar!");
        }else{
            System.out.println("Rabiscando");
        }
    }
    
    private void tampar(){
        this.tampada = true;
    }
    
    private void destampar(){
        this.tampada = false;
    }
}
