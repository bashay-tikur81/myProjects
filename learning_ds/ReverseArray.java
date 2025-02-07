import java.util.Arrays;

public class ReverseArray{
	public static void main(String[] args){
		Integer[] i = { 1, 2, 3, 4, 5 };
		String[] s = {"Jack", "Kate", "Hurley", "Jin", "Michael"};
		System.out.println(Arrays.toString(i));
		System.out.println(Arrays.toString(s));
		reverse(s);
		reverse(i);
		System.out.println("Reversing...");
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(i));


	}
	public static <E> void reverse(E[] arr){
		AStack<E> temp = new AStack<>(arr.length);
		for(int i = 0; i < arr.length; i++){
			temp.push(arr[i]);
		}
		for (int j = 0; j < arr.length; j ++){
			arr[j] = temp.pop();
		}
	}
	
}
