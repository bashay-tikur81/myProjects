public class ArrayQueue<E> implements Queue<E>{
	private E element;
	private int length = 0;
	private int finder = 0;
	private E[] queue;
	private int defaultCapacity = 1000;
	public ArrayQueue(){
		this(1000);
	}
	public ArrayQueue(int capacity){
		this.defaultCapacity = capacity;
		queue = (E[])new Object[capacity];
	}
	public void enqueue(E e){
		if(length == queue.length){
			System.out.println("Queue is full.");
		}
		int avail = (finder+length)%queue.length;
		queue[avail] = e;
		length++;
	}
	public E dequeue(){
		if(isEmpty()){return null; }
		E returnedValue = queue[finder];
		queue[finder] = null;
		length--;
		finder = (finder+1)%queue.length;
		return returnedValue;
	}
	public E first(){
		if(isEmpty()){return null; }
		return queue[finder];
	}
	public int size(){
		return length;
	}
	public boolean isEmpty(){
		return length == 0;
	}
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		int j = finder;
		while(queue[j] != null){
			sb.append(queue[j]);
			if(j+1 != finder && j+1 != length ){
				sb.append(",");
			}
			j = (j+1)%queue.length;
			if(j == finder){ break; }
		}
		return sb.append("]").toString();
	}
}
