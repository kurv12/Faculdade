/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Keven
 */
public class Peixe extends Animal {
    private String corEscama;
    
    public void soltarBolha(){
        System.out.println("Soltando bolhas.");
    } 
    
    @Override
    public void locomover() {
        System.out.println("Nadando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Se alimentando.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite som.");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
    
}
