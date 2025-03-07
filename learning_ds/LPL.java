
public class LPL<E> implements PositionalList<E> {

	private class Node<E> implements Position<E>{
		E element;
		Node<E> prev;
		Node<E> next;
		// constructor
		public Node(E element, Node<E> prev, Node<E> next){
			this.element = element;
			this.prev = prev;
			this.next = next;
		}
		
		// getters
		public E getElement(){
			return element;
		}
		public Node<E> getPrev(){
			return prev;
		}
		public Node<E> getNext(){
			return next;
		}

		// setters
		public void setElement(E e){
			element = e;
		}
		public void setPrev(Node<E> node){
			prev = node;
		}
		public void setNext(Node<E> node){
			next = node;
		}
	} /** end of inner class */
	
	// instance variables of LPL
	private Node<E> header;
	private Node<E> trailer;
	private int size = 0;

	// constructor of LPL
	public LPL(){
		header = new Node<>(null, null, null);
		trailer = new Node<>(null, header, null);
		header.setNext(trailer);
	}
	
	// accessor methods of LPL
	public boolean isEmpty(){
		return size == 0;
	}
	public int size(){
		return size;
	}
	public Position<E> first(){
		return position(header.getNext());
	
	}
	public Position<E> last(){
		return position(trailer.getPrev()) ;
	}
	public Position<E> before(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p);
		return  position(node.getPrev());
		
	}
	public Position<E> after(Position<E> p) throws IllegalArgumentException{
		Node<E> node = validate(p);
		return position(node.getNext());
	}

	// utilities
	public Node<E> validate(Position<E> p){
		if(!(p instanceof Node)) throw new IllegalArgumentException("Invalid p");
		Node<E> node = (Node) p; // safe casting
		if(node.getNext() == null){
			throw new IllegalArgumentException("p is no longer in the list");
		}
		return node;	
	}
	public Position<E> position(Node<E> node){
		if(node == header || node == trailer){
			return null; // don't expose user to sentinels
		}
		return node; // implicit up cast
	}
	public Position<E> addBetween(E e, Node<E> preced, Node<E> succ){
		Node<E> newest = new Node<>(e, preced, succ);
		preced.setNext(newest);
		succ.setPrev(newest);
		size++;
		return newest;
		
	}
	// updater methods

	public Position<E> addFirst(E e){
		return addBetween(e, header, header.getNext());
		
		
	}
	public Position<E> addLast(E e){
		return addBetween(e, trailer.getPrev(), trailer);
		
	}
	public Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException{
		Node<E> node = validate(p);
		return addBetween(e, node.getPrev(), node);
		
		
	}
	public Position<E> addAfter(Position<E> p, E e){
		Node<E> node = validate(p);
		return addBetween(e,node, node.getNext());
		
	}
	public E set(Position<E> p, E e){
		Node<E> node = validate(p);
		E answer = node.getElement();
		node.setElement(e);
		return answer;

		
	}
	public E remove(Position<E> p) throws IllegalArgumentException{
		Node<E> node = validate(p);
		Node<E> predecessor = node.getPrev();
		Node<E> successor = node.getNext();
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		size --;
		E answer = node.getElement();
		node.setElement(null);
		node.setNext(null);
		node.setPrev(null);
		return answer;
				
	}
	
}
