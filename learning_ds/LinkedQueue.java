
public class LinkedQueue<E> implements Queue<E>{
	SinglyLinkedList<E> list = new SinglyLinkedList<>();

	public void enqueue(E e){
		list.addLast(e);
	}
	public E dequeue(){
		return list.removeFirst();
	}
	public boolean isEmpty(){
		return list.isEmpty();
	}
	public int size(){
		return list.size();
	}
	public E first(){
		return list.first();
	}
	
}
