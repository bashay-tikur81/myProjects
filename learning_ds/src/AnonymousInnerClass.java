package learning_ds.src;
learning_ds.src;
package learning_ds;

abstract class Animal{
    public abstract void eat();
    public abstract void walk();
}

public class AnonymousInnerClass{
    public static void main(String[] args){
	Animal anime = new Animal(){
		public void eat(){
		    System.out.println("Animal is eating");
		}
		public void walk(){
		    System.out.println("Animal is walking");
		}
	    };
	Animal anime2 = new Animal(){
		public void eat(){
		    System.out.println("Anime2 is eating");
		}
		public void walk(){
		    ;
		}
	    };
	anime.eat();
	anime.walk();
	anime2.eat();
	anime2.walk();
    }
}
