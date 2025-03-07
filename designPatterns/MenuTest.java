public class MenuTest{
	public static void main(String[] args){
		PanCakeHouseMenu panCakeHouseMenu = new PanCakeHouseMenu();
		DinnerMenu dinnerMenu = new DinnerMenu();

		Waitress waitress = new Waitress(panCakeHouseMenu, dinnerMenu);
		waitress.printMenu();
	}
}
