public class Vendedor extends Funcionario {

    private boolean montanteDeVendas;

    public boolean getMontanteDeVendas() {
            return montanteDeVendas;
    }

    public void setMontanteDeVendas(boolean montanteDeVendas) {
            this.montanteDeVendas = montanteDeVendas;
    }


    public Vendedor(String nome, String endereco, String cpf, float salarioBruto) {
            super(nome, endereco, cpf, salarioBruto);
    }

    public float calcularSalarioLiquido(float salarioBruto) {
            if(montanteDeVendas) 
                    return (float)(this.salarioBruto * 1.1);
            return this.salarioBruto;
    }


}
