public class Imposto {
             
	protected float valor;

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Imposto(float valor) {
		this.valor = valor;		
	}
	
	public Imposto() {	}
	
	
	// Calcula os impostos de cada funcionario
	protected float calcularImpostoFuncionarios(Funcionario funcionario) {
        return (float) (funcionario.getSalarioBruto() *0.18);
    }
	//Calcula o imposto sobre as vendas
	protected float calcularImpostoVendas(Venda venda) {
		return (float) (venda.getValorVenda() * 0.15);
	}
	
}
