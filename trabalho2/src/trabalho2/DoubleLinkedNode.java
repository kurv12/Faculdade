/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;

/**
 *
 * @author Keven Costa
 */
public class DoubleLinkedNode {
    private Object item;
    private DoubleLinkedNode prev;
    private DoubleLinkedNode next;
    
    public DoubleLinkedNode(Object item){
        this.item = item;
        this.next = null;
        this.prev = null;
    }
    
    public DoubleLinkedNode(Object item, DoubleLinkedNode next, DoubleLinkedNode prev){
        this.item = item;
        this.next = next;
        this.prev = prev;
    }
    
    public DoubleLinkedNode(Object item, DoubleLinkedNode next){
        this.item = item;
        this.next = next;
        this.prev = null;
    }
    
    public DoubleLinkedNode(){
        this.item = null;
        this.next = null;
        this.prev = null;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public DoubleLinkedNode getNext() {
        return next;
    }

    public void setNext(DoubleLinkedNode next) {
        this.next = next;
    }

    public DoubleLinkedNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleLinkedNode prev) {
        this.prev = prev;
    }
    
}
