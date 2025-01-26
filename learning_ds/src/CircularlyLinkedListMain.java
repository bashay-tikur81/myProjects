package learning_ds;
class CircularlyLinkedList<E>{
    private class Node<E>{
	private E element;
	private Node<E> next;
	public Node(E element, Node<E> next){
	    this.element  = element;
	    this.next = next;
	}
	public E getElement(){
	    return element;
	}
	public Node<E> getNext(){
	    return next;
	}
	public void setNext(Node<E> n){
	    next = n;
	}
    }
    // instance variable of CircularlyLinkedList
    private Node<E> tail = null;
    int size = 0;
    // constructor
    public CircularlyLinkedList(){}
    
    public int size(){ return size; }
    public boolean isEmpty(){return size == 0;}
    
    public E first(){
	if(isEmpty()){
	    return null;
	}
	return tail.getNext().getElement();
    }
    public E last(){
	if(isEmpty()){
	    return null;
	}
	return tail.getElement();
    }
    public void rotate(){
	if(tail != null){
	    tail = tail.getNext();
	}
	
    }
    
    public void addFirst(E elem){
	// create a node
	if(size == 0){
	    tail = new Node<>(elem, null);
	    tail.setNext(tail);
	} else {
	    Node<E> newNode = new Node<>(elem,tail.getNext());
	    tail.setNext(newNode);
	}
	size++;
    }
    public void addLast(E elem){
	addFirst(elem);
	tail = tail.getNext();
    }
    
    public E removeFirst(){
	if(isEmpty()){
	    return null;
	}
	Node<E> head = tail.getNext();
	if(tail == head){
	    tail = null;
	} else{
	    tail.setNext(head.getNext());
	}
	size--;
	return head.getElement();
    }
    
    @Override
    public String toString(){
	StringBuilder sb = new StringBuilder();
	sb.append("[");
	if(tail == null){
	    return "[]";
	    
	}
	Node<E> terminator = tail;
	Node<E> trav = tail.getNext();
	while(trav != terminator){
	    sb.append(trav.getElement());
	    if(trav != terminator){
		sb.append(",");
	    }
	    trav = trav.getNext();
		    
	}
       
	sb.append(tail.getElement()+"]");
	return sb.toString();
    }
}

public class CircularlyLinkedListMain{
    public static void main(String[] args){
	CircularlyLinkedList<Integer> nums = new CircularlyLinkedList<>();
	nums.addFirst(22);
	nums.addFirst(11);
	nums.addFirst(99);
	nums.addLast(33);
	nums.addLast(44);
	nums.addLast(55);
	System.out.println(nums.removeFirst());
	System.out.println(nums.toString());
	
    }
}
