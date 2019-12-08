
public class Imposto {

    protected String tipo;
    protected float valor;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Imposto(String tipo, float valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public Imposto() {
    }

}
