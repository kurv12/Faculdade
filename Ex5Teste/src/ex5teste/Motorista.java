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
public class Motorista {
    private String nome, cpf, placaCarro, endereco;
    private int anoValidadeHabilitacao;

    public Motorista(String nome, String cpf, String placaCarro, String endereco, int anoValidadeHabilitacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.placaCarro = placaCarro;
        this.endereco = endereco;
        this.anoValidadeHabilitacao = anoValidadeHabilitacao;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getAnoValidadeHabilitacao() {
        return anoValidadeHabilitacao;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void imprimeInformacoesMotorista(){
        System.out.println("-------------------------------------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Placa do Carro: " + this.getPlacaCarro());
        System.out.println("Validade da habilitação: " + this.getAnoValidadeHabilitacao());
        System.out.println("Endereço: " + this.getEndereco());
    }
    
}
