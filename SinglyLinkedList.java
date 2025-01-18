
class Node<T>{
    T data;
    Node next;
    public Node(T data){
	this.data = data;
	this.next = null;
    }
}

class linkedList<T>{
    private Node head;
    public linkedList(){
	this.head = null;
    }

    public boolean isEmpty(){
	return head == null;
    }
    public void addFirst(T data){
	Node<T> newNode = new Node<>(data);
	if(isEmpty()){
	    head = newNode;
	} else{
	    newNode.next = head;
	    head = newNode;
	}
	
    }
    public void delete(T data){
	if(head == null){
	    System.out.println(data+" not found!");
	    return;
	}
	if(head.data.equals(data)){
	    head = head.next;
	} else{
	    Node trav = head;
	    while(trav.next != null && !(trav.next.data.equals(data))){
		trav = trav.next;
	    }
	    if(trav.next != null){
		trav.next = trav.next.next;
	    } else{
		System.out.println(data +" not found");
	    }
	}
    }
    @Override
    public String toString(){
	StringBuilder sb = new StringBuilder();
	sb.append("[");
	Node trav = head;
	while(trav != null){
	    sb.append(trav.data);
	    trav = trav.next;
	    if(trav != null){
		sb.append(",");
	    }
	}
	sb.append("]");
	return sb.toString();
    }
}
public class SinglyLinkedList{
    public static void main(String[] args){

	// Linked List of Integers
	linkedList<Integer> node = new linkedList<>();
	node.addFirst(3);
	node.addFirst(4);
	node.addFirst(31);
	node.addFirst(1288888);
	node.addFirst(88);
	node.delete(88);
	node.delete(31);
	node.delete(1288888);
	System.out.println(node);

	// Linked List of Strings
	linkedList<String> names = new linkedList<>();
	names.addFirst("Ababe");
	names.addFirst("Bob");
	names.addFirst("Uncle");
	names.delete("Bob");
	System.out.println(names);
	
	// Linked List of objects
	linkedList<Box> boxes = new linkedList<>();
	boxes.addFirst(new Box(3.3,8.8,9.8));
	boxes.addFirst(new Box(1.2,3.8,7.9));
	boxes.addFirst(new Box(4.5, 7.6,9.2));
	System.out.println(boxes);
    }
}

class Box{
    double height;
    double length;
    double width;
    public Box(double height, double length, double width ){
	this.height = height;
	this.length = length;
	this.width = width;
    }

    public double calculateArea(){
	return height*width*length;
    }
    
}
