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
public class Engenheiro extends Pessoa {
    private int crea;

    public Engenheiro(String cpf, String nome, int crea) {
        super(cpf, nome);
        this.crea = crea;
    }

    public int getCrea() {
        return crea;
    }

    public void setCrea(int crea) {
        this.crea = crea;
    }
 
 
}
