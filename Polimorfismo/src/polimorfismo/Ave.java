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
public class Ave extends Animal {
    private String corPena;
    
    public void fazerNinho(){
        System.out.println("Fazendo ninho.");
    }
    
    @Override
    public void locomover() {
        System.out.println("Voando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Se alimentando.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo Som.");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
}
