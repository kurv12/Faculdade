public abstract class Produto {

	public int id;
	protected int codigo;
	protected String nome;
	protected Fornecedor fornecedor;
	protected float precoDeCusto;
	protected float precoFinal;
	protected String apelido;
	protected Estoque estoque;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public float getPrecoDeCusto() {
		return precoDeCusto;
	}
	public void setPrecoDeCusto(float precoDeCusto) {
		this.precoDeCusto = precoDeCusto;
	}
	public float getPrecoFinal() {
		return precoFinal;
	}
	public void setPrecoFinal(float precoFinal) {
		this.precoFinal = precoFinal;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	public Estoque getEstoque() {
		return estoque;
	}
	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	
	public Produto() {
		
	}
	
	public Produto(String nome, float precoDeCusto,
			String apelido) {
		this.nome = nome;
		this.precoDeCusto = precoDeCusto;
		this.apelido = apelido;
	}
		
}
