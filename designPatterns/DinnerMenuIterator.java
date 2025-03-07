
public class DinnerMenuIterator implements Iterator{
	MenuItem[] items;
	int position = 0;

	public DinnerMenuIterator(MenuItem[] items){
		this.items = items;
	}
	public boolean hasNext(){
		if(position >= items.length || items[position] == null){
			return false;
		} else{
			return true;
		}
	}
	public MenuItem next(){
		MenuItem menuItem = items[position++];
		return menuItem;
	}
}
