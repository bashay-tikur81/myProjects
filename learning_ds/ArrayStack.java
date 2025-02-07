public class ArrayStack{
    public static void main(String[] args){
		AStack<Integer> stk = new AStack<>(10);
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
