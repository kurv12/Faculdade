public class Gerente extends Funcionario {
    private float salarioLiquido;

    
    public Gerente(String nome, String endereco, String cpf, float salarioBruto) {
            super(nome, endereco, cpf, salarioBruto);
    }

    
    @Override
    protected void calcularSalarioLiquido(float salarioBruto) {
        this.salarioLiquido = (float)(this.salarioBruto * 1.2);
    }

    @Override
    public String toString() {
        return "Gerente:" + super.toString() + "\n confianca = sim";
    }

}
    