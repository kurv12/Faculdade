public  class Fornecedor {

	private int id;
	private String nome;
	private String endereco;
	private String cnpj;

    public Fornecedor(String nome, String endereco, String cnpj) {
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
    }

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
    public String getCnpj() {
            return cnpj;
    }
    public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
    }


    public Fornecedor() {

    }

    public int getId() {
        return id;
    }


    void setId(int id) {
        this.id = id;
    }

}
