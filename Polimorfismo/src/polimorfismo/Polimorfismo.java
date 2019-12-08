/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Keven
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Peixe p = new Peixe();
        Cachorro c = new Cachorro();
        
        c.reagir("Oi meu bb");
    }
    
}
