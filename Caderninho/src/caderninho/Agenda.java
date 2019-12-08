/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caderninho;

/**
 *
 * @author Keven
 */
public class Agenda {
    Pessoa contatos[];
    int total;
    int maximo;
    Pessoa aux;

    public Agenda() {
        contatos = new Pessoa[2];
        this.total = 0;
        maximo = 2;
    }
    
    public void adicionar(Pessoa a){
        if(total+1 < maximo){
            contatos[total] = a;
            total++;
        }else{
            Pessoa aux = new Pessoa[maximo*2];
            for(int i = 0;)
            
        }
    }
    
    public void remover(String nome){
        int a = busca(nome);
        if(a >= 0){
            remover(a);
        }
    }
    
     public void remover(int i){
         for(int j = i; j < total; j++){
             contatos[j] = contatos[i+1];
         }
         total--;
    }
     
     public int busca (String nome){
         for(int i = 0; i<total; i++){
             if(contatos[i].getNome().equals(nome)){
                 return i;
             }
         }
         return -1;
    }
     
    public Pessoa buscar (String CNPJ){
        for(int i = 0; i < total; i++){
            if(contatos[i] instanceof PessoaFisica){
                PessaoFisica aux = (PessoaFisica) contatos[i];
                if(aux.getCPF().equals(CPF)){
                    return contatos[i];
                }
            }else{
                PessoaJuridica aux = (PessoaJuridica) contatos[i];
            }
        }
    }
}
