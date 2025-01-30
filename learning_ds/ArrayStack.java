
class Stack<T>{
    private int capacity;
    private T[] stack;
    private int length = -1;
    public Stack(){ this(1000); }
    public Stack(int capacity){
	this.capacity = capacity;
	stack = (T[])(new Object[capacity]);
    }
    public void push(T data){
	if(isFull()){
	    System.out.println("Stack is full, buffer overflow");
	    System.exit(1);
	}
	stack[++length] = data;
    }
    public T pop(){
	T value;
	if(isEmpty()){
	    System.out.println("Stack is empty, buffer underflow");
	    System.exit(1);
	}
	value = stack[length];
	
	/* dereference stack[length], stack would work with out it.
	   returning a cell to null reference is to assist Java's garbage collection
	   mechanism */
	stack[length] = null;
	length--;
	return value;
    }
    public boolean isFull(){ return length == capacity; }
    public boolean isEmpty(){ return length < 0; }
    public T peek(){
	if(isEmpty()){return null;}
	return stack[length];
    }
    public int size(){ return length+1; }
    @Override
    public String toString(){
	StringBuilder sb = new StringBuilder();
	sb.append("[");
	int temp = 0;
	while(temp < size()){
	    sb.append(stack[temp]);
	    ++temp;
	    if(temp < size()){ sb.append(" "); }
	}
	sb.append("]");
	return sb.toString();
    }
}
public class ArrayStack{
    public static void main(String[] args){
	Stack<Integer> stk = new Stack<>(10);
	for(int i = 0; i< 10; i++){
	    stk.push(i);
	}
	
	System.out.println(stk.toString());
	for(int i = 0; i < 10; i++){
	    System.out.print(stk.pop()+" ");
	}
	System.out.println();
	System.out.println(stk.toString());
    }
}
