public class FornecedorRecorrente extends Fornecedor {

	private float taxaDesconto;

	public float getTaxaDesconto() {
		return taxaDesconto;
	}

	public void setTaxaDesconto(float taxaDesconto) {
		this.taxaDesconto = taxaDesconto;
	}

    public FornecedorRecorrente(String nome, String endereco, String cnpj, float taxaDesconto) {
        super(nome, endereco, cnpj);
        this.taxaDesconto = taxaDesconto;
    }

	
	
}
