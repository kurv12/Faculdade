public class Vendedor extends Funcionario {

    private boolean montanteDeVendas;
    private float salarioLiquido;

    public boolean getMontanteDeVendas() {
            return montanteDeVendas;
    }

    public void setMontanteDeVendas(boolean montanteDeVendas) {
            this.montanteDeVendas = montanteDeVendas;
    }


    public Vendedor(String nome, String endereco, String cpf, float salarioBruto) {
            super(nome, endereco, cpf, salarioBruto);
    }

    protected void calcularSalarioLiquido(float salarioBruto) {
            if(this.montanteDeVendas == true) {
                    this.salarioLiquido = (float)(this.salarioBruto * 1.1);
            }
    }

    @Override
    public String toString() {
            return "Vendedor: " + super.toString() + "\n montanteDeVendas = " + montanteDeVendas + '}';
    }

}
