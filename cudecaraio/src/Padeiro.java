

public class Padeiro extends Funcionario{
	
    private float horasExtras;

    public float getHorasExtras() {
            return horasExtras;
    }

    public void setHorasExtras(float horasExtras) {
            this.horasExtras = horasExtras;
    }

    
    public Padeiro(String nome, String endereco, String cpf, float salarioBruto) {
            super(nome, endereco, cpf, salarioBruto);
            this.horasExtras = 0;
    }

    public float calcularSalarioLiquido(float salarioBruto) {
            return ((float)this.salarioBruto + (float)((this.salarioBruto * 0.25) * this.horasExtras));
    }


}
