public abstract class Funcionario {

    protected String nome;
    protected String endereco;
    protected String cpf;
    protected float salarioBruto;
    public int id;


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

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Funcionario(String nome, String endereco, String cpf, float salarioBruto) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.salarioBruto = salarioBruto;
    }

    @Override
    public String toString() {
        return "ID = " + id + "\n" + nome + "\n endereço = " + endereco + "\n CPF = " + cpf + "\n Salário Bruto = " + salarioBruto;
    }

}
