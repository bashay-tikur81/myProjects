package learning_ds.src;
@FunctionalInterface
interface Person{
    String profession(String name, String profession);
}

public class LambdaReturn{
    public static void main(String[] args){
	Person abebe = (name, profession) -> {
	    
	    System.out.println(name+" works as: "+ profession);
	    return profession;
	    
	};
	System.out.println(abebe.profession("Belay", "Doctor"));
	
    }
}
