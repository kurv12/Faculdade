/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5teste;

/**
 *
 * @author Keven
 */
public class Viagem {
    private Passageiro Passageiro;
    private Motorista Motorista;
    private String origem, destino;
    private double precoCorrida;

    public Viagem(Passageiro Passageiro, Motorista Motorista) {
        this.Passageiro = Passageiro;
        this.Motorista = Motorista;
    }

    public Passageiro getPassageiro() {
        return Passageiro;
    }

    public Motorista getMotorista() {
        return Motorista;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public double getPrecoCorrida() {
        return precoCorrida;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    public void imprimeInformacoesCorrida(){
        System.out.println("-------------------------------------------------");
        System.out.println("Motorista: " + this.getMotorista());
    }
}
