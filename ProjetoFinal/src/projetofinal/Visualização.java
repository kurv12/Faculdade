/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

/**
 *
 * @author Keven
 */
public class Visualização {
    private Gafanhoto espectador;
    private Video filme;

    public Visualização(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualiza\u00e7\u00e3o{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    public int avaliar(){
        
    }
    
    public int avaliar(int nota){
        
    }
    
    public int avaliar(int porc){
        
    }
        
}
