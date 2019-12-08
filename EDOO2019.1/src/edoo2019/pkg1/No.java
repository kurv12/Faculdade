package edoo2019.pkg1;

/**
 * Nó de uma lista encadeada.
 * 
 * @author Eraldo R. Fernandes (eraldo@facom.ufms.br)
 *
 * @param <T>
 */
class No<T> {
	/**
	 * Dado armazenado no nó.
	 */
	T info;

	/**
	 * Referência para o próximo nó da lista.
	 */
	No<T> prox;

	/**
	 * Cria um novo nó com a informação fornecida e cujo próximo nó é dado.
	 * 
	 * @param info
	 * @param prox
	 */
	No(T info, No<T> prox) {
		this.info = info;
		this.prox = prox;
	}
}
