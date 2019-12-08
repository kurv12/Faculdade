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
public class casaSobrado extends Casa{
    private int numAndares;
    
    public casaSobrado(float metragemTotal, String endereco, Engenheiro responsavel, UnidadeResidencial[] Unidades) {
        super(metragemTotal, endereco, responsavel, Unidades);
        this.numAndares = numAndares;
    }

    public int getNumAndares() {
        return numAndares;
    }

    public void setNumAndares(int numAndares) {
        this.numAndares = numAndares;
    }
    
}
