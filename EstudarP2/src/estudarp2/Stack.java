package estudarp2;

public interface Stack {
	// Insere objeto na pilha
	boolean push(Object value);

	// Remove e retorna o objeto no topo da pilha
	Object pop();

	// Apenas retorna o objeto no topo da pilha
	Object top();

	// Verifica se a pilha est ́a vazia
	boolean isEmpty();

	// Retorna o tamanho da pilha
	int size();
}