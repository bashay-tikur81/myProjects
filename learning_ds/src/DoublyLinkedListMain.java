package learning_ds;

class DoublyLinkedList<E>{
    // let's create private node
    private class Node<E>{
	// instance variables of this node
	E element;
	Node<E> prev;
	Node<E> next;
	// constructor
	public Node(E element, Node<E> prev, Node<E> next){
	    this.element = element;
	    this.prev = prev;
	    this.next = next;

	}
	public E getElement(){ return element; }
	public Node<E> getNext(){ return next; }
	public Node<E> getPrev(){ return prev; }
	public void setNext(Node<E> n){ next = n; }
	public void setPrev(Node<E> p){ prev = p; }
    }
    // instance variables of the DoublyLinkedList
    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;
    public DoublyLinkedList(){
	header = new Node<E>(null, null, null);
	trailer = new Node<E>(null, header, null);
	header.setNext(trailer);
    }

    public int size(){ return size; }
    public boolean isEmpty(){ return size == 0; }
    public E first(){
	if(isEmpty()){
	    return null;
	}
	return header.getNext().getElement(); }
    public E last(){
	if(isEmpty()){
	    return null;
	}
	return trailer.getPrev().getElement(); }
    public void addFirst(E elem){
	addBetween(elem, header, header.getNext());
    }
    public void addLast(E elem){
	addBetween(elem,trailer.getPrev(), trailer);
    }
    public void addBetween(E element, Node<E> predecessor, Node<E> successor){
	Node<E> newNode = new Node<>(element, predecessor, successor);
	predecessor.setNext(newNode);
	successor.setPrev(newNode);
	size++;
    }
    public E removeFirst(){
	if(isEmpty()){
	    return null;
	}
	return remove(header.getNext());
	
    }
    public E removeLast(){
	if(isEmpty()){
	    return null;
	}
	return remove(trailer.getPrev());
    }
    public E remove(Node<E> node){
	Node<E> predecessor = node.getPrev();
	Node<E> successor = node.getNext();
	predecessor.setNext(successor);
	successor.setPrev(predecessor);
	size--;
	return node.getElement();
    }
    @Override
    public String toString(){
	StringBuilder sb = new StringBuilder();
	sb.append("[");
	Node<E> trav = header.getNext();
	while(trav != trailer.getPrev()){
	    sb.append(trav.getElement());
	    trav = trav.getNext();
	    if(trav != trailer.getPrev()){
		sb.append(",");
	    }
	}
	sb.append("]");
	return sb.toString();
    }
}

public class DoublyLinkedListMain{
    public static void main(String[] args){
	DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
	dll.addFirst(22);
	dll.addFirst(33);
	dll.addLast(55);
	dll.addLast(88);
	dll.addFirst(11);
	System.out.println(dll.toString());
	System.out.println(dll.first());

	
    }
}
