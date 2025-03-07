public class DinnerMenu{
	static int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	public DinnerMenu(){
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("Vegetarian BLT", "Bacon with luttuce and tomato", false, 2.99);
		addItem("Vegetarian BLT", "Bacon with luttuce and tomato", false, 2.99);
		addItem("Vegetarian BLT", "Bacon with luttuce and tomato", false, 2.99);
		addItem("Vegetarian BLT", "Bacon with luttuce and tomato", false, 2.99);		
	}

	public void addItem(String name, String descritpion, boolean vegetarian, double price){
		MenuItem menuItem = new MenuItem(name, descritpion, vegetarian, price);
		menuItems[numberOfItems++] = menuItem;
	}
	public Iterator creatIterator(){
		return new DinnerMenuIterator(menuItems);
	}
	
}
