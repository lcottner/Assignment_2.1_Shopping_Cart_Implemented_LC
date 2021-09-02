

/** A class that describes the collective operations of a shopping cart using ArrayBag */
public class ShoppingCart {
	ArrayBag myBag;
	
/**The default constructor for ShoppingCart*/
	public ShoppingCart(){
	myBag=new ArrayBag();
	}

/**Checks to see if the cart is empty
@returns boolean whether or not the cart is empty*/
public void emptyCart() {
	System.out.println("The cart gets completely emptied");
	myBag.clear();
}

/**Places a specified item into the shopping cart
@param thing The specified item
@returns boolean whether or not the item was added */
public void addItem(Item thing) {
	if (myBag.add(thing)==true)
		System.out.println(thing.getName() +" has been added to the cart");
	else 
		System.out.println(thing.getName() +" cannot be added to the cart");
}

/**Removes a specified item into the shopping cart
@param thing The specified item
@returns boolean whether or not the item was added */
public void removeItem(Item thing) {
	if (myBag.remove(thing)==true)
		System.out.println(thing.getName() +" has been removed from the cart");
	else
		System.out.println(thing.getName() +" cannot be removed, because it is not in the cart");

}

/**Checks how many items is in the shopping cart
@returns boolean whether or not the items have been counted */
public int totalCount() {
	return myBag.getCurrentSize();
}


/**Checks to see if the cart has the specific item
@param thing The specified item
@returns boolean whether or not the cart has the item*/
public void contains(Item thing) {
	if (myBag.contains(thing)){
		System.out.println("The cart does contain: " + thing.getName());
	}
	else {
		System.out.println("The cart does not contain: " + thing.getName());
	}
		
	
}

}


