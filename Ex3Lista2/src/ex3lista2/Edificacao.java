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
public abstract class Edificacao {
    protected float metragemTotal;
    protected String endereco;
    protected Engenheiro responsavel;
    protected UnidadeResidencial [] Unidades;

    public Edificacao(float metragemTotal, String endereco, Engenheiro responsavel, UnidadeResidencial[] Unidades) {
        this.metragemTotal = metragemTotal;
        this.endereco = endereco;
        this.responsavel = responsavel;
        this.Unidades = Unidades;
    }

    public float getMetragemTotal() {
        return metragemTotal;
    }

    public void setMetragemTotal(float metragemTotal) {
        this.metragemTotal = metragemTotal;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Engenheiro getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Engenheiro responsavil) {
        this.responsavel = responsavil;
    }

    public UnidadeResidencial[] getUnidades() {
        return Unidades;
    }

    public void setUnidades(UnidadeResidencial[] Unidades) {
        this.Unidades = Unidades;
    }
    
    public boolean cadastrarUnidade(UnidadeResidencial novaUnid){
        for (UnidadeResidencial Unidade : this.Unidades) {
            if (Unidade == null) {
                this.Unidades = novaUnid;
            }
        }
    }
    
    public abstract String descricaoDoImovel();
    
}
