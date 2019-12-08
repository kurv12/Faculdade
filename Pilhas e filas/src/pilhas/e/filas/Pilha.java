/**
 * TAD Pilha: armazena lista de itens, sendo que os itens sÃ£o inseridos e
 * removidos da mesma extremidade da lista (topo da pilha). O Ãºltimo elemento
 * inserido serÃ¡ o primeiro a ser removido.
 * 
 * @author eraldo
 *
 */
package pilhas.e.filas;
public interface Pilha<T> {
	/**
	 * Insere um item no topo da pilha.
	 * 
	 * @param item
	 */
	void empilhar(T item);

	/**
	 * Remove o item no topo da pilha e o retorna.
	 * 
	 * @return
	 */
	T desempilhar();

	/**
	 * Retorna o item no topo da pilha (sem removÃª-lo).
	 * 
	 * @return
	 */
	T topo();

	/**
	 * Retorna {@code true} se a pilha estÃ¡ vazia.
	 * 
	 * @return
	 */
	boolean vazia();

	/**
	 * Retorna o nÃºmero de itens na pilha.
	 * 
	 * @return
	 */
	int tamanho();
}
