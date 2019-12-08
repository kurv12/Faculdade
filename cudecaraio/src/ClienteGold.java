public class ClienteGold extends Cliente {

	public ClienteGold(String nome, String endereco, String cpf, String telefone, float desconto) {
		super(nome, endereco, cpf, telefone, desconto);
	}

	public float calcularDesconto(float valorTotalCompra) {
		return (valorTotalCompra - (valorTotalCompra * 5/100));
	}
	
	
}
