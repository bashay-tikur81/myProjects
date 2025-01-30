
// A stack interface
public interface Stack<E>{
    /**
     * @return the size of the stack  
     */
    int size();
    /**
     * @return true if the list is empty and false if the list is not empty
     */
    boolean isEmpty();
    /**
     * @return nothing
     * @param an element of type E and push it to the list
     */
    void push(E e);
    /**
     * @return type the element E
     * it removes the element from the stack
     */
    E pop();
    /**
     * @return the element type E
     * It only returns the value at top without removing it
     */
    E top();
    
}
