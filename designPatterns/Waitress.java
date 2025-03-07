public class Waitress{
	PanCakeHouseMenu panCakeHouseMenu;
	DinnerMenu dinnerMenu;
	public Waitress(PanCakeHouseMenu panCakeHouseMenu, DinnerMenu dinnerMenu){
		this.panCakeHouseMenu = panCakeHouseMenu;
		this.dinnerMenu = dinnerMenu;
	}
	public void printMenu(){
		Iterator pancakeIterator = panCakeHouseMenu.creatIterator();
		Iterator dinnerIterator = dinnerMenu.creatIterator();
		System.out.println("MENU\n-------\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinnerIterator);
		
	}
	
	private void printMenu(Iterator iterator){
		while(iterator.hasNext()){
			MenuItem menuItem = iterator.next();
			System.out.print(menuItem.getName()+",");
			System.out.print(menuItem.getPrice() + " ---");
			System.out.println(menuItem.getDescription());
		}
	}
	
}
