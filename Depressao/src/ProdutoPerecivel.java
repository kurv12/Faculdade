

public class ProdutoPerecivel extends Produto {

    protected String dataValidade;

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public ProdutoPerecivel() {

    }

    public ProdutoPerecivel(String nome, float precoDeCusto,
            String apelido) {
        super(nome, precoDeCusto, apelido);
        // TODO Auto-generated constructor stub
    }

}
