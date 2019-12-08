public class Gerente extends Funcionario {
    private boolean confianca;

    public boolean isConfianca() {
        return confianca;
    }

    public void setConfianca(boolean confianca) {
        this.confianca = confianca;
    }

    public Gerente(String nome, String endereco, String cpf, float salarioBruto) {
            super(nome, endereco, cpf, salarioBruto);
            this.confianca = false;
    }


    
    
    public float calcularSalarioLiquido(float salarioBruto) {
        if(confianca)
            return (float)(this.salarioBruto * 1.2);
        return this.salarioBruto;
        
    }


}
    