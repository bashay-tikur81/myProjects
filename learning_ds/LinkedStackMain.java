
class LinkedStack<E> implements Stack{
	// private SinglyLinkedList<E> list = new SinglyLinkedList<>();
	private SinglyLinkedList<E> list;
	public LinkedStack(){
		list = new SinglyLinkedList<>();
	}
	public int size() { return list.size(); }
	public boolean isEmpty(){ return list.isEmpty(); }
	public void push(E element) { list.addFirst(element); }
	public E top() { return list.first(); }
	public E pop() { list.removeFirst(); }
	
}

public class LinkedStackMain{
	public static void main(String[] args){
		LinkedStack<Integer> ls = new LinkedStack<>();
		ls.push(22);
		System.out.println(ls.size());
		System.out.println(ls.top());
		System.out.println(ls.pop());
		System.out.println(ls.size());
		
	}
}
