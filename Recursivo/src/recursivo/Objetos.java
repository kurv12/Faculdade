package recursivo;

/**
 *
 * @author Keven
 */
public class Objetos {
    public static void main(String[] args){
        Endereço endereço = new Endereço();
        endereço.setLogradouro("Av. Marcio Lima Nantes");
        endereço.setCidade("Coxim");
        endereço.setEstado("ms");
        endereço.setCep ( "79400000");
        
        System.out.println(endereço);
    }
}
