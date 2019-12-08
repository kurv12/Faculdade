package edoo2019.pkg1;

/**
 * Item de uma tabela de símbolos (TS).
 * 
 * Um item associa um valor a uma chave.
 * 
 * @author Eraldo R. Fernandes (eraldo@facom.ufms.br)
 *
 */
public class TSItem<K, V> {

	/**
	 * Chave deste item.
	 */
	private K chave;

	/**
	 * Valor associado à chave.
	 */
	private V valor;

	/**
	 * Construtor padrão.
	 */
	public TSItem() {
	}

	/**
	 * Cria um item com a chave e o valor dados.
	 * 
	 * @param chave
	 * @param valor
	 */
	public TSItem(K chave, V valor) {
		this.chave = chave;
		this.valor = valor;
	}

	/**
	 * @return a chave deste item.
	 */
	public K getChave() {
		return chave;
	}

	/**
	 * Altera a chave deste item.
	 * 
	 * @param chave
	 */
	public void setChave(K chave) {
		this.chave = chave;
	}

	/**
	 * @return o valor associado a este item.
	 */
	public V getValor() {
		return valor;
	}

	/**
	 * Altera o valor associado a este item.
	 * 
	 * @param valor
	 */
	public void setValor(V valor) {
		this.valor = valor;
	}

	public String toString() {
		return chave.toString();
	}

}
