
public class Iterable<E> implements Iterator<E>{
	private E[] data;
	private int i;

	public Iterable(E[] data, int i){
		super();
		this.data = data;
		this.i = i;
	}

	public boolean hasNext(){
		return false;
	}
	public E next(){
		return null;
	}
	public Iterator<E> getIterator(){
		return null;
	}
	
}
