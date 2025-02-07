import java.lang.IllegalStateException;

public class ArrayList<E> implements List<E>{
	private E[] list;
	private int size;
	public static final int CAPACITY = 100;
	
	// constructor
	public ArrayList() {
		this(CAPACITY);
	}
	public ArrayList(int capacity){
		list = (E[])new Object[capacity];
	}

	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return size == 0;
	}
	public E set(int i, E e){
		checkIndex(i, size);
		E toBeReturned;
		toBeReturned = list[i];
		list[i] = e;
		return toBeReturned;
		
	}
	public E get(int i){
		if(isEmpty()){ return null; }
		checkIndex(i, size);
		return list[i];
	}

	public void add(int i, E e){
		// lets create a temporary variable for holding after to be added
		checkIndex(i, size + 1);
		if(size == list.length){ // not enough capacity, then double it
			resize(2*list.length);
		}
		for(int j = size-1; j >= i; j--){
			list[j + 1] = list[j];
		}
		list[i] = e;
		size++;
	}
	public E remove(int i){
		checkIndex(i, size);
		E toBeRemoved = list[i];
		
		for(int j = i; j < size-1; j++){
			list[j] = list[j + 1];
		}
		list[size - 1] = null; // helping garbage collection
		size--;
		return toBeRemoved;
		
	}
	protected void checkIndex(int i, int z){
		if (i < 0 || i >= z) {
			throw new IndexOutOfBoundsException("Illegal index: " + i);
		}
	}
	protected void resize(int capa){
		E temp[] =  (E[]) Object[capa];
		for(int i = 0; i < size; i++){
			temp[i] = list[i];
		}
		list = temp;
		
	}
}
