public class SLL{
	public static void main(String[] args){
		SinglyLinkedList<Integer> itr = new SinglyLinkedList<>();
		itr.addFirst(99);
		itr.addLast(100);
		itr.addLast(200);
		itr.addFirst(300);
		System.out.println(itr.size());
		System.out.println(itr.removeFirst());
		System.out.println(itr.removeLast());
	}
}
