/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;

/**
 *
 * @author Keven costa
 */
public class Trabalho2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        Object a = 1, b = 2, c = 3, d = 4, e = 5, f = 6, g = 7, h = 8, i = 9, j = 10, k = 11, l = 12;
       lista.insert(a);
        lista.insert(b);
        lista.insert(c);
        lista.insert(d);
        
        System.out.println("Teste - Lista encadeada");
        System.out.println("=================================================");
        System.out.println(lista);
        System.out.println(lista.getFirstHalf().toString());
        System.out.println(lista.getSecondHalf().toString());
        System.out.println("=================================================");
        
        ListaDuplamenteEncadeada lista2 = new ListaDuplamenteEncadeada();
        lista2.insert(e);
        lista2.insert(f);
        lista2.insert(g);
        lista2.insert(h);
        
        System.out.println("Teste - Lista duplamente encadeada");
        System.out.println("=================================================");
        System.out.println(lista2);
        System.out.println("tamanho: " + lista2.size());
        System.out.println(lista2.getFirstHalf());
        System.out.println(lista2.getSecondHalf());
        lista2.invert();
        System.out.println("Invertida: " + lista2);
        System.out.println("=================================================");
        
        ListaCircular lista3 = new ListaCircular();
        lista3.insert(i);
        lista3.insert(j);
        lista3.insert(k);
        lista3.insert(l);
        
        System.out.println("Teste = Lista circular");
        System.out.println("=================================================");
        System.out.println(lista3);
        System.out.println("Tamanho: " + lista3.size());
        System.out.println(lista3.getFirstHalf());
        System.out.println(lista3.getSecondHalf());
        lista3.invert();
        System.out.println("Invertida: " + lista3);
        System.out.println("=================================================");
    }
    
}
