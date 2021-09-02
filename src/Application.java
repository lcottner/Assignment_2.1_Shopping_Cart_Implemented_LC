/**The main method to test ShoppingCart.java and Item.java*/
public class Application {
	
	public static void main (String[]args) {
	ShoppingCart myCart= new ShoppingCart();
	
	Item apple=new Item("Apple", 1.79);
	Item chocolate=new Item("Chocolate", 1.12);
	Item friedRice=new Item("Fried rice", 5.99);
	Item water=new Item("Water", 2.99);
	Item milk= new Item("Milk", 1.89);
	
	myCart.addItem(apple);
	myCart.addItem(chocolate);
	myCart.addItem(friedRice);
	myCart.addItem(water);
	myCart.addItem(milk);
	
	System.out.println("The shopping cart has: " +myCart.totalCount() +" items");
	System.out.println();
	
	myCart.contains(apple);
	myCart.contains(chocolate);
	myCart.contains(friedRice);
	myCart.contains(water);
	myCart.contains(milk);
	
	System.out.println();
	
	myCart.removeItem(apple);
	myCart.removeItem(milk);
	myCart.removeItem(milk);

	System.out.println("The shopping cart has: " +myCart.totalCount() +" items");
	System.out.println();
	
	
	myCart.removeItem(friedRice);
	myCart.removeItem(chocolate);
	myCart.removeItem(water);
	System.out.println("The shopping cart has: " +myCart.totalCount() +" items");
	System.out.println();
	
	myCart.addItem(water);
	myCart.addItem(chocolate);
	myCart.emptyCart();
	System.out.println("The shopping cart has: " +myCart.totalCount() +" items");
	System.out.println();
	
	myCart.contains(apple);
	myCart.contains(chocolate);
	myCart.contains(friedRice);
	myCart.contains(water);
	myCart.contains(milk);
	
	}
}
