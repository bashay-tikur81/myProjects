package learning_ds;
class GenericObject{
    Object obj;
    public GenericObject(Object obj){
	this.obj = obj;
    }

    public void print(){
	System.out.println(obj);
    }
}

class GenericPrinter<T>{

    T data;
    public GenericPrinter(T data){
	this.data = data;
    }
    public void print(){
	System.out.println(data);
    }
}


public class Generic{
    public static void main(String[] args){
	GenericPrinter<Integer> integerPrinter = new GenericPrinter<>(33);
	integerPrinter.print();

	GenericPrinter<String> stringPrinter = new GenericPrinter<>("I love Java");
	stringPrinter.print();

	GenericObject intPrinter = new GenericObject(88);
	intPrinter.print();
	GenericObject strPrinter = new GenericObject("I love programming");
	strPrinter.print();
	
	
	
    }
}
