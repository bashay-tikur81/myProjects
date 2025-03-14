
public class MenuItem{
	String name;
	String description;
	boolean vegetarian;
	double price;

	// constructor
	public MenuItem(String name, String description, boolean vegetarian, double price){
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	public String getName(){
		return name;
	}
	public String getDescription(){
		return description;
	}
	public boolean isVegatarian(){
		return vegetarian;
	}
	public double getPrice(){
		return price;
	}
}
