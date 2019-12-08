import java.util.Date;

public class VendaAVista extends Venda{

	public VendaAVista(Date dataVenda, Vendedor vendedor, String formaPagamento, Cliente cliente) {
		super(dataVenda, vendedor, formaPagamento, cliente);
		// TODO Auto-generated constructor stub
	}
	
	protected float calcularValorTotal() {
		return 0;
	}
	
	
}
