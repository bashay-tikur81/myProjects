import java.util.ArrayList;
import java.util.List;

public class PanCakeHouseMenu{
    List<MenuItem> menuItems;
	public PanCakeHouseMenu(){
		menuItems = new ArrayList<MenuItem>();
		addItem("K&B's pancake breakfast", "pancake with scrambled eggs and toast", true, 2.89);
	    addItem("K&B's pancake breakfast", "pancake with scrambled eggs and toast", true, 2.89);
	    addItem("K&B's pancake breakfast", "pancake with scrambled eggs and toast", true, 2.89);
	}

	public void addItem(String name, String description, boolean vegetarian, double price){
		MenuItem menuItem =  new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
		
	}
	public Iterator creatIterator(){;
		return new PanCakeHouseMenuIterator((ArrayList)menuItems);
	}
}
