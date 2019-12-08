/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edoo2019.pkg1;

/**
 *
 * @author Keven
 */
public interface Saco<T> extends Iterable<T> {

	/**
	 * Insere um item no saco. Mesmo que o item já esteja no saco, ele será
	 * inserido novamente, gerando uma duplicata.
	 * 
	 * @param item
	 *            item a ser inserido.
	 */
	public void insere(T item);

	/**
	 * Retorna se o saco está vazio.
	 * 
	 * @return
	 */
	public boolean vazio();

	/**
	 * Retorna o número de itens no saco.
	 * 
	 * @return
	 */
	public int tamanho();

}
