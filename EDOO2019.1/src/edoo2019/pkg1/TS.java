package edoo2019.pkg1;

/**
 * Interface de um TAD tabela de símbolos (TS).
 * 
 * Uma TS armazena pares (chave, valor). As chaves de uma TS são únicas e não
 * nulas. Os valores são não nulos.
 * 
 * As operações são: put(chave, valor), get(chave), remove(chave), vazia(),
 * contem(chave) e tamanho(). Além destas operações, esta interface extende
 * {@code Iterable<K>} e, portanto, deve implementar o método iterator() que
 * retorna um iterador sobre as chaves da tabela.
 * 
 * @author Eraldo R. Fernandes (eraldo@facom.ufms.br)
 *
 */
public interface TS<K, V> extends Iterable<K> {

	/**
	 * Associa o valor {@code valor} à chave {@code chave}. Se a chave ainda não
	 * existe na TS, então um novo item é inserido. Caso contrário, o valor
	 * associado à chave é atualizado.
	 * 
	 * @param chave
	 * @param value
	 */
	public void put(K chave, V valor);

	/**
	 * Retorna o valor associado à chave dada. Se a chave dada não está na TS,
	 * retorna {@code null}.
	 * 
	 * @param chave
	 * @return
	 */
	public V get(K chave);

	/**
	 * Remove o item associado à chave dada.
	 * 
	 * @param chave
	 */
	public void remove(K chave);

	/**
	 * Retorna se a TS está vazia.
	 * 
	 * @return
	 */
	public boolean vazia();

	/**
	 * Retorna se a TS contém a chave dada.
	 * 
	 * @param chave
	 * @return
	 */
	public boolean contem(K chave);

	/**
	 * Retorna o tamanho da tabela (número de chaves armazenadas).
	 * 
	 * @return
	 */
	public int tamanho();

}
