/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criandoclasse;

/**
 *
 * @author Keven
 */
public class CriandoClasse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        
        c1.modelo = "BIC";
        c1.cor = "Azul";
        c1.status();
    }
    
}
