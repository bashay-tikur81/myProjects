
public class IsHTMLMatched{
	public static void main(String[] args){
		String html = "<ol><li>is there anything</li></ol>";
			System.out.println(isHTMLMatched(html));
		
	}

	public static boolean isHTMLMatched(String html){
		// let's create a stack
		AStack<String> htmlTagStack = new AStack<>();
		int openingAngleBracketIndex = html.indexOf('<');
		while(openingAngleBracketIndex != -1){
			int closingAngleBracketIndex = html.indexOf('>', openingAngleBracketIndex+1);
			if(closingAngleBracketIndex == -1){
				return false;
			}
			String tag = html.substring(openingAngleBracketIndex+1, closingAngleBracketIndex);
			// let's check if it's closing or opening tag, closing tag starts with /
			if(!tag.startsWith("/")){
				htmlTagStack.push(tag);
			}
			else{
				if(htmlTagStack.isEmpty()){
					return false;
				}
				if(!tag.substring(1).equals(htmlTagStack.pop())){
					return false;
				}
			}
			openingAngleBracketIndex =  html.indexOf('<', closingAngleBracketIndex+1);
		}
		return htmlTagStack.isEmpty();
		
	}

}
