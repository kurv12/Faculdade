import java.util.Date;

public abstract class Venda {

	protected Date dataVenda;
	protected Vendedor Vendedor;
	protected String formaPagamento;
	protected Cliente cliente;
        protected double valorVenda;
        //TODO Produtos
        
	
	protected abstract float calcularValorTotal();
	
	public Date getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
	public Vendedor getVendedor() {
		return Vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		Vendedor = vendedor;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Venda(Date dataVenda, Vendedor vendedor, String formaPagamento, Cliente cliente) {
		super();
		this.dataVenda = dataVenda;
		Vendedor = vendedor;
		this.formaPagamento = formaPagamento;
		this.cliente = cliente;
	}

    public double getValorVenda() {
        return this.valorVenda;
    }
	
	
	
}
