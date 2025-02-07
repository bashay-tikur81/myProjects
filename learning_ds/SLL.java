public class SLL<E> implements Stack<E>{
	SinglyLinkedList list = new SinglyLinkedList<>();
	// public SLL(){}

	public boolean isEmpty(){
		return list.isEmpty();
	}
	public int size(){
		return list.size();
	}
	public void push(E element){
		list.addFirst(element);
		
	}
	public E top(){
		return (E)list.first();
	}
	public E pop(){
		E value = (E) list.first();
		list.removeFirst();
		return value;
	}
	public static void main(String[] args){
		SLL<String> str = new SLL<>();
		str.push("Here is my first");
		System.out.println(str.top());
		System.out.println(str.pop());
				
	}
}
