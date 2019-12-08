package edoo2019.pkg1;

import java.util.Iterator;

/**
 * Implementa uma tabela de símbolos (TS) usando uma lista encadeada não
 * ordenada.
 * 
 * @author Eraldo R. Fernandes (eraldo@facom.ufms.br)
 *
 * @param <K>
 * @param <V>
 */
public class TSEncadeada<K, V> implements TS<K, V> {

	/**
	 * Primeiro nó da lista encadeada.
	 */
	private No<TSItem<K, V>> primeiro;

	/**
	 * Número chaves (associadas a valores não-nulos) nesta tabela.
	 */
	int tamanho;

	/**
	 * Cria tabela vazia.
	 */
	public TSEncadeada() {
		primeiro = null;
		tamanho = 0;
	}

	@Override
	public void put(K chave, V valor) {
		// Inicia busca no primeiro nó da lista.
		No<TSItem<K, V>> no = primeiro;

		// Percorre nós da lista.
		while (no != null) {
			if (no.info.getChave().equals(chave)) {
				no.info.setValor(valor);
				return;
			}

			// Próximo nó da lista.
			no = no.prox;
		}

		/*
		 * Se não existe um item com a chave dada, então cria um novo nó e
		 * insere no início da lista.
		 */
		primeiro = new No<>(new TSItem<>(chave, valor), primeiro);

		// Incrementa tamanho da tabela.
		++tamanho;
	}

	@Override
	public V get(K chave) {
		// Inicia busca no primeiro nó da lista.
		No<TSItem<K, V>> no = primeiro;

		// Percorre nós da lista.
		while (no != null) {
			if (no.info.getChave().equals(chave))
				// Encontrou um item com a chave dada. Retorna seu valor.
				return no.info.getValor();

			// Próximo nó da lista.
			no = no.prox;
		}

		// Se não existe um item com a chave dada retorna {@code null}.
		return null;
	}

	@Override
	public boolean vazia() {
		return primeiro == null;
	}

	@Override
	public boolean contem(K chave) {
		return get(chave) != null;
	}

	@Override
	public void remove(K chave) {
		if (primeiro == null)
			return;

		if (chave == null)
			return;

		if (primeiro.info.getChave().equals(chave)) {
			// Chave a ser removida está no primeiro nó.
			--tamanho;
			primeiro = primeiro.prox;
			return;
		}

		// Inicia busca no primeiro nó da lista.
		No<TSItem<K, V>> no = primeiro;

		/*
		 * Percorre nós da lista usando uma referência "atrasada" (referencia o
		 * nó anterior ao buscado).
		 */
		while (no.prox != null) {
			if (no.prox.info.getChave().equals(chave)) {
				--tamanho;
				no.prox = no.prox.prox;
				return;
			}

			// Próximo nó da lista.
			no = no.prox;
		}
	}

	@Override
	public int tamanho() {
		return tamanho;
	}

	@Override
	public Iterator<K> iterator() {
		return new IteradorChave();
	}

	/**
	 * Iterador nas chaves da tabela.
	 * 
	 * @author Eraldo R. Fernandes (eraldo@facom.ufms.br)
	 *
	 */
	private class IteradorChave implements Iterator<K> {

		/**
		 * Nó atual do iterador.
		 */
		private No<TSItem<K, V>> no;

		/**
		 * Cria um iterador no início da lista encadeada.
		 */
		public IteradorChave() {
			no = primeiro;
		}

		@Override
		public boolean hasNext() {
			return no != null;
		}

		@Override
		public K next() {
			K chave = no.info.getChave();
			no = no.prox;
			return chave;
		}

	}

}
