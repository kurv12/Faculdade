/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopratico;

/**
 *
 * @author Keven
 */
public class Livro implements Publicacao {
    private Pessoa leitor;
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;

    public Livro(String titulo, String autor, int totPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    
    public void detalhesDaLeitura(Pessoa leitor){
        this.detalhesDoLivro();
        System.out.println("Quem está lendo: " + this.getLeitor());
        System.out.println("Página Atual: " + this.getPagAtual());
    }
    
    public void detalhesDoLivro(){
        System.out.println(" ---- Sobre o Livro ------");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor(a): " + this.getAutor());
        System.out.println("Quantidade de páginas: " + this.getTotPaginas());
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(p < this.getTotPaginas()){
            this.setPagAtual(p);
        }else{
            this.setPagAtual(0);
        }
    }

    @Override
    public void avançarPag() {
        if(this.getPagAtual() < this.getTotPaginas()){
            this.setPagAtual(this.getPagAtual() + 1);
        }else if(this.getPagAtual() == this.getTotPaginas()){
            this.fechar();
            System.out.println("Fim do livro.");
        }else{
            System.out.println("Não há mais páginas.");
        }
            
    }

    @Override
    public void voltarPag() {
        if(this.getPagAtual() > 0){
            this.setPagAtual(this.getPagAtual() - 1);
        }else{
            System.out.println("Impossível voltar página.");
        }
    }
}
