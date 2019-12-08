package estudarp2;

public class TesteExcecoes {

    public static void imprimePosicaoVetorV1(String[] vet, int pos) {
        if (pos < 0 || pos >= vet.length) {
            throw new ArrayIndexOutOfBoundsException("A posição é inválida: " + pos);
        } else {
            System.out.println(vet[pos]);
        }
    }

    public static void imprimePosicaoVetorV2(String[] vet, int pos) {
        try {
            if (pos < 0 || pos >= vet.length) {
                throw new ArrayIndexOutOfBoundsException("A posição é inválida: " + pos);
            } else {
                System.out.println(vet[pos]);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
            System.out.println("As posições válidas são de 0 a " + (vet.length - 1));
        } finally {
            System.out.println("Encerrando a execução do programa!");
        }
    }

    public static void imprimePosicaoVetorV3(String[] vet, int pos) throws ArrayIndexOutOfBoundsException {
        if (pos < 0 || pos >= vet.length) {
            throw new ArrayIndexOutOfBoundsException("A posição é inválida: " + pos);
        } else {
            System.out.println(vet[pos]);
        }
    }

    public static void imprimePosicaoVetorV4(String[] vet, int pos) throws InvalidPositionException {
        if (pos < 0 || pos >= vet.length) {
            throw new InvalidPositionException("A posição é inválida: " + pos);
        } else {
            System.out.println(vet[pos]);
        }
    }

    public static void main(String[] args) {
        String[] v = new String[]{"ana", "banana", "abacate"};
        try {
            imprimePosicaoVetorV4(v, -1);
        } catch (InvalidPositionException ex) {
            ex.printStackTrace();
            
            //System.err.println(ex.getMessage());
            //System.out.println(ex.getMessage());
            System.out.println("As posições válidas são de 0 a " + (v.length - 1));
        }

    }

}
