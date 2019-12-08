/**
 * Implementa o TAD Fila usando um vetor para armazenar os itens.
 * 
 * @author eraldo
 *
 * @param <T>
 * 
 */
package pilhas.e.filas;
public class FilaSeq<T> implements Fila<T> {

	/**
	 * Vetor que armazena os itens na fila.
	 */
	private T[] itens;

	/**
	 * Ã�ndice do inÃ­cio da fila.
	 */
	private int ini;

	/**
	 * Ã�ndice do final da fila.
	 */
	private int fim;

	/**
	 * Cria uma fila vazia.
	 */
	@SuppressWarnings("unchecked")
	public FilaSeq() {
		ini = 0;
		fim = -1;
		itens = (T[]) new Object[10];
	}

	@Override
	public void enfileirar(T item) {
		fim = (fim + 1) % itens.length;
		itens[fim] = item;
	}

	@Override
	public T desenfileirar() {
		T item = itens[ini];
		itens[ini] = null;
		ini = (ini + 1) % itens.length;
		return item;
	}

	@Override
	public T primeiro() {
		return itens[ini];
	}

	@Override
	public boolean vazia() {
		return false;
	}

	@Override
	public int tamanho() {
		return -1;
	}

}
