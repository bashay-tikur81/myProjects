package learning_ds.src;

@FunctionalInterface
interface Animal{
    void walk();
}

public class LambdaExpression{
    public static void main(String[] args){

	Animal anime = new Animal(){
		public void walk(){
		    System.out.println("Anime is walking");
		}
		
	    };

	// using lambda expression
	Animal anime2 = () -> {
	    System.out.println("Anime is walking!");
	    System.out.println("Second  line is being printed");
	};
	
	anime.walk();
	anime2.walk();
		
    }
}
