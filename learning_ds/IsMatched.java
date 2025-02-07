
public class IsMatched{
	public static void main(String[] args){
		String expression1 = "({[parenthese matching]})";
		System.out.println(isMatched(expression1));
	}

	public static boolean isMatched(String expression){
		AStack<Character> expr = new AStack<>();
		String opening = "({[";
		String closing = ")}]";
		char[] expreArray = expression.toCharArray();
		for(int i = 0; i < expression.length(); i++){
			// if matches the opening push it
			if(opening.indexOf(expreArray[i]) != -1){
				expr.push(expreArray[i]);
			}
			else if(closing.indexOf(expreArray[i]) != -1){
				if(expr.isEmpty()){
					return false;
				}
				if(closing.indexOf(expreArray[i]) != opening.indexOf(expr.pop())){
					return false;
				}
			}
		}
		return expr.isEmpty();
	}
}
