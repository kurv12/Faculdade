/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uec;

import java.util.Random;

/**
 *
 * @author Keven
 */
public class Luta{
    private Lutador desafiado, desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    
    public void marcarLuta(Lutador desafiante,Lutador desafiado){
        if(desafiante.getCategoria().equals(desafiado.getCategoria()) && desafiado != desafiante){
            this.aprovada = true;
            this.desafiado = desafiado;
            this.desafiante = desafiante;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        if(this.aprovada){
            System.out.println("------ Desafiado -----");
            this.desafiado.apresentar();
            System.out.println("------ Desafiante ----");
            this.desafiante.apresentar();
            System.out.println("---------------------- Resultado -------------");
            
            Random aleatorio = new Random();
            int vencedor  = aleatorio.nextInt(3);
            switch(vencedor){
                case 0:
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Ganhador: " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Ganhador: " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        }else{
            System.out.println("Luta não pode acontecer.");
        }
    }
}
