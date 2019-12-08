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
public class Casa extends Edificacao {
    protected boolean condominio;

    public Casa(boolean condominio, float metragemTotal, String endereco, Engenheiro responsavel, UnidadeResidencial[] Unidades) {
        super(metragemTotal, endereco, responsavel, Unidades);
        this.condominio = condominio;
    }

    @Override
    public String descricaoDoImovel() {
        return "Situado à: " + super.endereco + "\n" + "Área total: " +super.metragemTotal + "\n" + "Responsável: " + super.responsavel + "\n" + "Número de Andares: " + super.Unidades.length + "\n" + "Unidade: " + Arrays.toString(this.Unidades);
    }

    public boolean isCondominio() {
        return condominio;
    }

    public void setCondominio(boolean condominio) {
        this.condominio = condominio;
    }
    
}
