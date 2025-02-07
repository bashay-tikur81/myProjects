public class LinkedCircularQueue<E> implements CircularQueue<E>{
	CircularlyLinkedList<E> clist = new CircularlyLinkedList<>();

	public void enqueue(E e){
		clist.addLast(e);
	}
	public E dequeue(){
		return clist.removeFirst();
	}
	public E first(){
		return clist.first();
	}
	public boolean isEmpty(){
		return clist.isEmpty();
	}
	public void rotate(){
		clist.rotate();
	}
	public int size(){
		return clist.size();
	}
}
