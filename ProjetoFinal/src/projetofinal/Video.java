/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

/**
 *
 * @author Keven
 */
public class Video implements AcoesVideo{

    private String titulo;
    private int avalicao;
    private int views;
    private int curtidas;
    private boolean reproduzino;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avalicao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzino = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvalicao() {
        return avalicao;
    }

    public void setAvalicao(int avalicao) {
        this.avalicao = avalicao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzino() {
        return reproduzino;
    }

    public void setReproduzino(boolean reproduzino) {
        this.reproduzino = reproduzino;
    }
    
    
    @Override
    public void play() {
        this.reproduzino = true;
    }

    @Override
    public void pause() {
        this.reproduzino = false;
    }

    @Override
    public void like() {
        this.curtidas ++;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avalicao=" + avalicao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzino=" + reproduzino + '}';
    }
    
}
