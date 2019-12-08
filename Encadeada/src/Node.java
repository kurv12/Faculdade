/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 201819070174
 */
public class Node {
    private Object item;
    private Node next;
    
    public Node(Object item){
        this.item = item;
        this.next = null;
    }
    
    public Node(Object item, Node next){
        this.item = item;
        this.next = next;
    }
    
    public Node(){
        
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
}
