import java.util.ArrayList;

public class PanCakeHouseMenuIterator implements Iterator{
	int position = 0;
	ArrayList<MenuItem> menuItems;
	public PanCakeHouseMenuIterator(ArrayList<MenuItem> menuItems){
		this.menuItems = menuItems;
	}

	public MenuItem next(){
		MenuItem menuItem = menuItems.get(position++);
		return menuItem;
	}
	public boolean hasNext(){
		if(position >= menuItems.size() || menuItems.get(position) == null){
			
			return false;
		} else{
			return true;
		}
	}
}
