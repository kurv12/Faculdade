/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Keven
 */
public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //construtor
    public Conta() {
        this.saldo = 0;
        this.status = false;
    }

    //métodos especiais
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public boolean getStatus(){
        return status;
    }
    
    public void setStatus(boolean status){
        this.status = status;
    }
    
    
    //metodos personalizados
    public void estadoAtual(){
        System.out.println("--------------------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
                
        if(this.tipo.equals("cc")){
            this.setSaldo(50);
        }else if (this.tipo.equals("cp")){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if(this.saldo > 0){
            System.out.println("Conta com dinheiro!");
        }else if(this.saldo < 0){
            System.out.println("Conta em débito!");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float v){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito efetuado com sucesso, na conta de " + this.getDono());
        }else{
            System.out.println("Função indisponível!");
        }
    }
    
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo()>= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente!");
            }            
        }else{
            System.out.println("Função indisponivel!");
        }
    }
    
    public void pagarMensal(){
        float v = 0;
        if(this.getTipo().equals("cc")){
            v = 12;
        }else if (this.getTipo().equals("cp")){
            v = 20;
        }
        
        if(this.getStatus()){
            if(this.getSaldo()>v){
                this.setSaldo(getSaldo()-v);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            }else{
                System.out.println("Saldo Insuficiente!");
            }
        }else{
            System.out.println("Impossivel Pagar!");
        }
    }
}
