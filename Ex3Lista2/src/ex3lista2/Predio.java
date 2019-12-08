/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3lista2;

import java.util.Arrays;

/**
 *
 * @author Keven
 */
public class Predio extends Edificacao{
    private String nome;
    private int numAndares, apPorAndar;
    
    public Predio(String nome, int numAndares, int apPorAndar, float metragemTotal, String endereco, Engenheiro responsavel, UnidadeResidencial[] Unidades) {
        super(metragemTotal, endereco, responsavel, Unidades);
        this.nome = nome;
        this.numAndares = numAndares;
        this.apPorAndar = apPorAndar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumAndares() {
        return numAndares;
    }

    public void setNumAndares(int numAndares) {
        this.numAndares = numAndares;
    }

    public int getApPorAndar() {
        return apPorAndar;
    }

    public void setApPorAndar(int apPorAndar) {
        this.apPorAndar = apPorAndar;
    }

    @Override
    public String descricaoDoImovel() {
        return "Prédio: " + nome + "\n" + "Situado à: " + super.endereco + "\n" + "Área total: " +super.metragemTotal + "\n" + "Resnponsável: " + super.responsavel + "\n" + "Número de Andares: " + super.Unidades.length + "\n" + "Número de apartamentos por Andar: " + this.apPorAndar + "\n" + "Unidade: " + Arrays.toString(this.Unidades);
    }
    
}
