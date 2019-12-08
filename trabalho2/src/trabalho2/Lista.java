package trabalho2;



/**
 *
 * @author keven costa
 */
public interface Lista {

    //Insere item em uma posição
    boolean insert(int pos, Object obj);
    //insere no começo
    boolean insert(Object obj);
    //Insere objeto na ultima posição
    boolean insertLast(Object obj);
    //Remove elemento de determinada posição
    boolean remove(int pos);
    //Remove o ultimo objeto da lista
    Object removeLast();
    //Remove elemento do começo da lista
    Object remove();
    //Retorna se lista está vazia
    boolean isEmpty();
    //retorna tamanho
    int size();
    //Retorna um objeto
    Object peek(int pos);
    //Ordena lista
    void sort();
    //inverte lista
    void invert();
    //retorno da primeira metade da lista
    Lista getFirstHalf();
    //retorna segunda metade da lista
    Lista getSecondHalf();
    //Verifica se objeto está na lista
    boolean contains(Object obj);
    //Todos os valores dos elemetnos
    String toString();
}
