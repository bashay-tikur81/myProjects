
public interface List<E>{
	int size();
	boolean isEmpty();
	E get(int i) throws IndexOutBoundsException;
	void add(int i, E e) throws IndexOutBoundsException;
	E remove(int i)throws IndexOutBoundsException;
	E set(int i, E e) throws IndexOutBoundsException;
}
