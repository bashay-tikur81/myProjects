class SinglyLinkedList<E>{
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;
	private class Node<E>{
		private E element;
		private Node<E> next;
		public Node(E element, Node<E> next){
			this.element = element;
			this.next = next;
		}
		public E getElement() {
		return element;}
		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> n) {
			next = n;
		}
	}
	// constructor
	public SinglyLinkedList(){
		
	}

	// methods of SinglyLinkedList
	public int size() {
		return size;
	}
	public boolean isEmpty(){
		return size == 0;
	}
	public void addFirst(E e){
		head = new Node<>(e, head);
		if(isEmpty()){ tail = head; }
		++size;
	}
	public void addLast(E e){
		Node<E> newNode = new Node<>(e, null);
		if(isEmpty()){
			head = newNode;
		} else{
			tail.setNext(newNode);
		}
		tail = newNode;
		++size;
		
	}
	public E removeFirst(){
		if(isEmpty()){return null; }
		E value = head.getElement();
		head = head.getNext();
		--size;
		if(size == 0){ tail = null; }
		return value;
	}
	public E removeLast(){
		E value;
		Node<E> trav = head;
		
		while(trav.getNext() != tail){
			trav = trav.getNext();
		}
		value = trav.getNext().getElement();
		trav.setNext(null);
		return value;
		
	}
	public E first(){
		if(isEmpty()){ return null; }
		return head.getElement();
	}
	public E last(){
		if(isEmpty()){ return null; }
		return tail.getElement();
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
