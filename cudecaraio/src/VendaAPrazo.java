import java.util.Date;

public class VendaAPrazo extends Venda {

	private int numParcelas;

	public int getNumParcelas() {
		return numParcelas;
	}

	public void setNumParcelas(int numParcelas) {
		this.numParcelas = numParcelas;
	}

	public VendaAPrazo(Date dataVenda, Vendedor vendedor, String formaPagamento, Cliente cliente, int numParcelas) {
		super(dataVenda, vendedor, formaPagamento, cliente);
		this.numParcelas = numParcelas;
	}
	
	protected float calcularValorTotal() {
		return 0;
	}
	
}
