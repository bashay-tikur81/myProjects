class Node<T>{
    T data;
    Node next;
    public Node(T data){
	this.data = data;
	this.next = null;
    }
}
class Stack<T>{
    private Node head;
    public Stack(){
	head = null;
    }
    
    public void push(T data){
	Node<T> newNode = new Node<>(data);
	if(head == null){
	    head = newNode;
	} else{
	    Node temp = head;
	    head = newNode;
	    newNode.next = temp;
	}
	
    }
    // public T pop(){}
    // public boolean isEmpty(){}
    // public int size(){}

    public String toString(){
	StringBuilder sb = new StringBuilder();
	sb.append("[");

	Node temp = head;
	while(temp != null){
	    sb.append(temp.data+" ");
	    temp = temp.next;
	}
	sb.append("]");
	return sb.toString();
    }
}


public class LinkedListStack{
    public static void main(String[] args){
	Stack<Integer> stk = new Stack<>();
	stk.push(11);
	stk.push(22);
	stk.push(33);
	System.out.println(stk.toString());
    }
}
