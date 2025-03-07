
public class LinkedPositionalList<E> implements PositionalList<E>{
	
	/* ----------nested Node class---------- */
	private static class Node<E> implements Position<E>{
		private E element;
		private Node<E> next;
		private Node<E> prev;

		// constructor
		public Node(E e, Node<E> prev, Node<E> next){
			this.element = element;
			this.prev = prev;
			this.next = next;
		}

		public E getElement() throws IllegalStateException{
			if(next == null){
				throw new IllegalStateException("Position no longer valid");
			}
			return element;
		}
		public Node<E> getPrev(){
			return prev;
		}
		public Node<E> getNext(){
			return next;
		}
		public void setElement(E e){
			element = e;
		}
		public void setPrev(Node<E> p){
			prev = p;
		}
		public void setNext(Node<E> p){
			next = p;
		}
		
	} /* ----------end of nested Node class ----------*/

	// instance variable of the LinkedPositionalList
	private Node<E> header;
	private Node<E> trailer;
	private int size = 0;

	/* construct the new empty list */
	public LinkedPositionalList(){
		header = new Node(null, null, null);
		trailer = new Node(null, header, null);
		header.setNext(trailer);
	}
	
	// private utilities
	/** Validate the position and return it as a node */
	public Node<E> validate(Position<E> p) throws IllegalArgumentException{
		if (!(p instanceof Node))
			throw new IllegalArgumentException("Invalid p");
		Node<E> node = (Node<E>) p; // safe cast
		if(node.getNext() == null){
			throw new IllegalArgumentException("p is no longer in the list");
		}
		return node;
	}
	/** Returns the given node as a position(or null if it is a sentinel). */
	private Position<E> position(Node<E> node){
		if(node == header || node == trailer){
			return null;
		}
		return node;
	}

	// public accessor methods
	/** Returns the number of elements in the list */
	public int size() {
		return size;
	}

	/** Tests whether the linked list is empty */
	public boolean isEmpty(){
		return size == 0;
	}

	/** Returns the first position in the linked list */
	public Position<E> first(){
		return position(header.getNext());
	}

	/** Returns the last position in the linked list( or null if empty )*/
	public Position<E> last(){
		return position(trailer.getNext());
	}

	/** Returns the position immediately before Position p */
	public Position<E> before(Position<E> p) throws IllegalArgumentException{
		Node<E> node = validate(p);
		return position(node.getPrev());
	}
	/** Returns the position immediately after Position p*/
	public Position<E> after(Position<E> p) throws IllegalArgumentException{
		Node<E> node = validate(p);
		return position(node.getNext());
	}

	// private utilities
	/** Adds the element e to the linked list between given nodes. */
	private Position<E> addBetween(E e, Node<E> pred, Node<E> succ){
		Node<E> newest = new Node<>(e, pred, succ); // create and link a new node
		pred.setNext(newest);
		succ.setPrev(newest);
		size++;
		return newest;
	}

	// public update methods
	/** Inserts element e at the front of the linked list and returns its new position */
	public Position<E> addFirst(E e){
		return addBetween(e, header, header.getNext()); // just after the header
	}

	/** Inserts element e at the back of the linked list and returns its new position */
	public Position<E> addLast(E e){
		return addBetween(e, trailer.getPrev(), trailer); // just before the trailer
	}
	
	/** Inserts element e immediately before position p, and returns its new position */
	public Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException {
		Node<E> node = validate(p);
		return addBetween(e, node.getPrev(), node);
	}

	/** Inserts element e immediately after position p, and returns its new position */
	public Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException {
		Node<E> node = validate(p);
		return addBetween(e, node, node.getNext());
	}

	/** Replaces the element stored at position p and returns the replaced element */
	public E set(Position<E> p, E e) throws IllegalArgumentException{
		Node<E> node = validate(p);
		E answer = node.getElement();
		node.setElement(e);
		return answer;
		
	}
	/**Removes the element stored at Position p and returns it (invalidating p)*/
	public E remove(Position<E> p) throws IllegalArgumentException{
		Node<E> node = validate(p);
		Node<E> predecessor = node.getPrev();
		Node<E> successor = node.getNext();
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		size--;
		E answer = node.getElement();
		node.setElement(null);
		node.setPrev(null);
		node.setNext(null);
		return answer;
	}

	
}
