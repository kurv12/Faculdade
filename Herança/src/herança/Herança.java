/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herança;

/**
 *
 * @author Keven
 */
public class Herança {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Silvano");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.setCurso("Enfermagem");
        a1.setMatricula(252);
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Juliana desmaiada");
        b1.setSexo("F");
        b1.setBolsa(12.5f);
        b1.setMatricula(2469);
        b1.pagarMensalidade();
        
    }
    
}
