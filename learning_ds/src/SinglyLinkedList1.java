package learning_ds.src;
learning_ds.src;
class SinglyLinkedList<E>{
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
    // instance variable of SingleLinkedList
    private Node<E> head = null;
    private Node<E> tail = null;
    int size;
    // constructor
    public SinglyLinkedList(){}
    
    public int size(){ return size; }
    public boolean isEmpty(){return size == 0;}
    public E first(){
	if(isEmpty()){
	    return null;
	}
	return head.getElement();
    }
    public E last(){
	if(isEmpty()){
	    return null;
	}
	return tail.getElement();
    }
    public void addFirst(E elem){
	head = new Node<>(elem,head);
	if(size == 0){
	    tail = head;
	}
	size++;
    }
    public void addLast(E elem){
	Node<E> newNode = new Node<>(elem, null);
	if(isEmpty()){
	    head = newNode;
	} else{
	    tail.setNext(newNode);
	}
	tail = newNode;
	size++;
    }
    public E removeFirst(){
	if(isEmpty()){
	    return null;
	}
	E value = head.getElement();
	head = head.getNext();
	size--;
	if(size == 0){
	    tail = null;
	}
	return value;
    }
    @Override
    public String toString(){
	StringBuilder sb = new StringBuilder();
	sb.append("[");
	Node<E> trav = head;
	while(trav != null){
	    sb.append(trav.getElement());
	    if(trav != null){
		sb.append(",");
	    }
	    trav = trav.getNext();
		    
	}
	sb.append("]");
	return sb.toString();
    }
}


public class SinglyLinkedList1{
    public static void main(String[] args){
	SinglyLinkedList<Integer> itr = new SinglyLinkedList<>();
	itr.addFirst(99);
	itr.addFirst(33);
	itr.addLast(44);
	itr.addLast(55);
	itr.addFirst(22);
	itr.addFirst(33);
	System.out.println(itr.toString());
	
    }
}
