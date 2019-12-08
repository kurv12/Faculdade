/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tadjava;

/**
 *
 * @author Keven
 */
public class SacolaFloatSequencial implements SacolaFloat{
    private float[] vetor;
    private int n;

    public SacolaFloatSequencial() {
        this.vetor = new float[10];
        this.n = 0;
    }

    
    @Override
    public void insere(float item) {
        this.vetor[n++] = item;
    }

    @Override
    public float get(int i) {
        return this.vetor[i];
    }

    @Override
    public int tamanho() {
        return this.n;
    }
    
}
