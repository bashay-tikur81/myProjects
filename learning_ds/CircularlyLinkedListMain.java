
public class CircularlyLinkedListMain{
    public static void main(String[] args){
		CircularlyLinkedList<Integer> nums = new CircularlyLinkedList<>();
		nums.addFirst(22);
		nums.addFirst(11);
		nums.addFirst(99);
		nums.addLast(33);
		nums.addLast(44);
		nums.addLast(55);
		System.out.println(nums.removeFirst());
		System.out.println(nums.toString());
	
    }
}
