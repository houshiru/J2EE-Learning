package shoppingcar;

public class Test {
	public static void main(String[] args) {
		Shoppingcar shoppingcar = new Shoppingcar();
		shoppingcar.buy(1);
		shoppingcar.buy(2);
		shoppingcar.buy(1);
		shoppingcar.update(2, 5);
		shoppingcar.show();
		
		shoppingcar.clear();
		shoppingcar.show();
	}
}
