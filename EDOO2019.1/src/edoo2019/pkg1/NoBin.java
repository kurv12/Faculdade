/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edoo2019.pkg1;

/**
 *
 * @author Keven
 */
public class NoBin<T> {
    T info;
    NoBin<T> esq;
    NoBin<T> dir;
    
    NoBin(T info){
        this.info = info;
    }
    
    NoBin(T info, NoBin<T> esq, NoBin<T> dir){
        this.info = info;
        this.esq = esq;
        this.dir = dir;
    }
}
