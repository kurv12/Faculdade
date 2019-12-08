

public class Padeiro extends Funcionario{
	
    private float horasExtras;
    private float salarioLiquido;

    public float getHorasExtras() {
            return horasExtras;
    }

    public void setHorasExtras(float horasExtras) {
            this.horasExtras = horasExtras;
    }


    public Padeiro(String nome, String endereco, String cpf, float salarioBruto) {
            super(nome, endereco, cpf, salarioBruto);
    }

    protected void calcularSalarioLiquido(float salarioBruto) {
            this.salarioLiquido = ((float)this.salarioBruto + (float)((this.salarioBruto * 0.25) * this.horasExtras));
    }

    @Override
    public String toString() {
            return " Padeiro: " + super.toString() + "\n horasExtras = " + horasExtras;
    }

}
