package recursivo;

/**
 *
 * @author Keven
 */
public class Endereço {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    
    @Override
    public String toString(){
        return logradouro;
    }
    
    public String getEstado(){
        return this.estado;
    }
    public void setEstado(String estado){
        if(estado.lenght()==2){
            this.estado = estado.toUpperCase();
        }
    }
    
    public String getCep(){
        return this.cep.substring(0,5)+"-"+this.cep.substring(5,0);
    }
    public void setCep(String cep){
        this.cep = cep;
    }

    
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
