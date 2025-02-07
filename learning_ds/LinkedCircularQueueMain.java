public class LinkedCircularQueueMain {
	public static void main(String[] args){
		LinkedCircularQueue<String> cq = new LinkedCircularQueue<>();
		cq.enqueue("Learning");
		cq.enqueue("Java");
		// System.out.println(cq.dequeue());
		System.out.println(cq.size());
		System.out.println(cq.toString());
	}
}
