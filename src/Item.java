/** A class that describes an Item in a grocery store */
public class Item{

/**A String variable to hold the name of the item*/
private String name;

/**A double variable to hold the price of the item*/
private double price;

/**The default constructor of the class Item*/
public Item() {
	name="";
	price=0.00;
}

/**The preferred constructor of the class Item
 * @param a String, b double
 * */
public Item(String a, double b) {
	name=a;
	price=b;
}


/**Gets the name of the item
@returns String of the item’s name*/
public String getName() {
	return name;
}

/**Gets the price of the item
@returns String of the item’s price*/
public double getPrice() {
	return price;
}

/**Sets the name of the item
@param title The new name of the item
@returns nothing */
public void setName(String title) {
	name=title;
}

/**Sets the price of the item
@param amt The new price of the item
@returns nothing */
public void setPrice(double amt) {
	price=amt;
}

}
