package edoo2019.pkg1;

import java.util.Iterator;

/**
 * Implementa uma tabela de símbolos (TS) usando um vetor não ordenado.
 * 
 * @author Eraldo R. Fernandes (eraldo@facom.ufms.br)
 *
 * @param <K>
 * @param <V>
 */
public class TSVetor<K, V> implements TS<K, V> {

	/**
	 * Vetor onde os itens são armazenados.
	 */
	private TSItem<K, V>[] itens;

	/**
	 * Quantidade de itens no vetor. Apenas as n primeiras posições do vetor contém
	 * itens válidos. O restante é nulo.
	 */
	private int n;

	/**
	 * Cria tabela vazia.
	 */
	@SuppressWarnings("unchecked")
	public TSVetor() {
		n = 0;
		itens = (TSItem<K, V>[]) new TSItem[10];
	}

	/**
	 * Retorna o índice no vetor onde a chave dada se encontra. Se a chave não está
	 * na TS, então retorna n.
	 * 
	 * @param chave
	 * @return
	 */
	private int getPosicao(K chave) {
		for (int i = 0; i < n; ++i)
			if (chave.equals(itens[i].getChave()))
				return i;
		return n;
	}

	@Override
	public void put(K chave, V valor) {
		int p = getPosicao(chave);
		if (p < n)
			// Chave já está na TS. Atualiza seu valor.
			itens[p].setValor(valor);
		else {
			// Nova chave.
			itens[p] = new TSItem<>(chave, valor);
			++n;
		}
	}

	@Override
	public V get(K chave) {
		int p = getPosicao(chave);
		if (p < n)
			return itens[p].getValor();
		return null;
	}

	@Override
	public boolean vazia() {
		return n == 0;
	}

	@Override
	public boolean contem(K chave) {
		return getPosicao(chave) < n;
	}

	@Override
	public void remove(K chave) {
		int p = getPosicao(chave);
		if (p < n) {
			// Coloca o último item na posição do item removido.
			itens[p] = itens[n - 1];
			itens[n - 1] = null;
			--n;
		}
	}

	@Override
	public int tamanho() {
		return n;
	}

	@Override
	public Iterator<K> iterator() {
		return new Iterador();
	}

	/**
	 * Iterador nas chaves da tabela.
	 * 
	 * @author Eraldo R. Fernandes (eraldo@facom.ufms.br)
	 *
	 */
	private class Iterador implements Iterator<K> {

		/**
		 * Índice do item atual.
		 */
		private int i;

		/**
		 * Inicializa o iterator no início do array.
		 */
		public Iterador() {
			this.i = 0;
		}

		@Override
		public boolean hasNext() {
			return i < n;
		}

		@Override
		public K next() {
			return itens[i++].getChave();
		}

	}

}
