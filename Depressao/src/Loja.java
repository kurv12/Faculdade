

import java.util.ArrayList;
import java.util.List;

public class Loja {

	public String nome;
	public String endereco;
	public String telefone;
	public String responsavel;
	
	public List<Cliente> clientes;
	public List<Estoque> estoques;
	public List<Fornecedor> fornecedores;
	public List<Vendedor> vendedores;
	public List<Padeiro> padeiros;
	public List<Imposto> impostos;
	public List<Gerente> gerentes;
 	public List<ProdutoPerecivel> produtosPereciveis;
 	public List<ProdutoNaoPerecivel> produtosNaoPereciveis;
 	public List<Venda> vendas;
        public List<Funcionario> funcionarios;
 	
	public Loja() {
                this.funcionarios = new ArrayList<>();
		this.clientes = new ArrayList<>();
		this.estoques = new ArrayList<>();
		this.fornecedores = new ArrayList<>();
		this.vendedores = new ArrayList<>();
		this.padeiros = new ArrayList<>();
		this.gerentes = new ArrayList<>();
		this.impostos = new ArrayList<>();
		this.produtosPereciveis = new ArrayList<>();
		this.produtosNaoPereciveis = new ArrayList<>();
		this.vendas = new ArrayList<>();
	};
	
 	
 	
}
