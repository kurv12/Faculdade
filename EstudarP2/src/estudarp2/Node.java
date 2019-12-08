package estudarp2;


public class Node {

	private Object item;
	private Node next;
	
	public Node(Object item, Node next) {
		this.item = item;
		this.next = next;
	}
	
	public Node(Object item) {
		this.item = item;
		this.next = null;
	}
	
	public Node() {
		this.item = null;
		this.next = null;
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
