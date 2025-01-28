package learning_ds.src;

public class CastingException{
    public static void main(String[] args){
	Number n;
	Integer i;
	Number np;
	Double d;
	
	n = new Integer(22);
	i = (Integer) n;
	n = new Double(3.14);
	np = new Double(3.14134);
	d = (Double) np;
	// the following are illegal
	// i = (Integer) n; // after n = new Double(3.14);
	// d = (Double) i;
	
	System.out.println(i);
	System.out.println(d);
    }
}
