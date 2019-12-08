/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3lista2;

/**
 *
 * @author Keven
 */
public class UnidadeResidencial extends Pessoa {
    protected float metragemUnidade;
    protected int numQuartos, numBanheiros;
    protected Pessoa proprietário;

    public UnidadeResidencial(String cpf, String nome, float metragemUnidade, int numQuartos, int numBanheiros, Pessoa proprietário) {
        super(cpf, nome);
        this.metragemUnidade = metragemUnidade;
        this.numQuartos = numQuartos;
        this.numBanheiros = numBanheiros;
        this.proprietário = proprietário;
    }

    public float getMetragemUnidade() {
        return metragemUnidade;
    }

    public void setMetragemUnidade(float metragemUnidade) {
        this.metragemUnidade = metragemUnidade;
    }

    public int getNumQuartos() {
        return numQuartos;
    }

    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }

    public int getNumBanheiros() {
        return numBanheiros;
    }

    public void setNumBanheiros(int numBanheiros) {
        this.numBanheiros = numBanheiros;
    }

    public Pessoa getProprietário() {
        return proprietário;
    }

    public void setProprietário(Pessoa proprietário) {
        this.proprietário = proprietário;
    }
    
    
}
