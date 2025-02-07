
public class QueueMain{
	public static void main(String[] args){
		ArrayQueue<Integer> aq = new ArrayQueue<>();
		aq.enqueue(11);
		aq.enqueue(22);
		aq.enqueue(33);
		aq.enqueue(44);
		System.out.println(aq.first());
		System.out.println(aq.toString());
		System.out.println(aq.size());
		
	}
}
