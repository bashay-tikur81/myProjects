package learning_ds.src;
public class ExceptionHandling{
    public static void main(String[] args){

	int i = 100;
	int j = 0;
	try {
	    j = 81/i;
	    if(j == 0){
		throw new ZeroDivisionException("My own exception");
	    }
	} catch(ArithmeticException ae){
	    j = 81;
	    System.out.println("The default value is: "+ j);
	} catch(ZeroDivisionException zde){
	    System.out.println("Can't divide by 0 " + zde);
	    
	}catch(Exception e){
	    System.out.println("Something went wrong! "+ e);
	}

	System.out.println(j);
	System.out.println("Bye!");
    }
}

class ZeroDivisionException extends RuntimeException{
    public ZeroDivisionException(){
	super("Division by zero exception");
    }
    public ZeroDivisionException(String exception){
	super(exception);
    }
}
