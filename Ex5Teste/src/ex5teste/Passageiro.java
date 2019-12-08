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
public class Passageiro {
    private String nome, cpf, telefone, endereco;

    public Passageiro(String nome, String cpf, String telefone, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
    }
    
    public void imprimeInformacoesPassageiro(){
        System.out.println("-------------------------------------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Endereço: " + this.getEndereco());
    }
}
