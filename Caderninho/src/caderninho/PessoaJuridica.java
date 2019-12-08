/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caderninho;

/**
 *
 * @author Keven
 */
public class PessoaJuridica extends Pessoa {
    private int CNPJ;
    private int inscricaoestadual;
    private String razaoSocial;

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public int getInscricaoestadual() {
        return inscricaoestadual;
    }

    public void setInscricaoestadual(int inscricaoestadual) {
        this.inscricaoestadual = inscricaoestadual;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
}
