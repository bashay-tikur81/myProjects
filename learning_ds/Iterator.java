import java.util.NoSuchElementException;

public interface Iterator<E>{
	boolean hasNext();

	E next() throws NoSuchElementException;

	Iterator<E> getIterator();

	// E remove() throws IllegalStateException;
}
