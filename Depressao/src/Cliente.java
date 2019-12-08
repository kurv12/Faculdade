public class Cliente {

	public int id;
	private String nome;
	private String endereco;
	private String cpf;
	private String telefone;
	private float desconto;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public float getDesconto() {
		return desconto;
	}
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	
	public Cliente() {
		
	};
	
	public Cliente(String nome, String endereco, String cpf, String telefone, float desconto) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
		this.desconto = desconto;
	}
	
	public float calcularDesconto(float valorTotalCompra) {
		return valorTotalCompra;
	}
	
}
