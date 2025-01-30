public class StackSLL<E>{
	public static void main(String[] args) {
		SinglyLinkedList<String> stackInteger = new SinglyLinkedList<>();
		//pushing
		stackInteger.addFirst("abcd");
		stackInteger.addFirst("efg");
		stackInteger.addFirst("hij");
		//top
		System.out.println(stackInteger.first());
		//popping
		System.out.println(stackInteger.removeFirst());
		System.out.println(stackInteger.toString());
	}


}
