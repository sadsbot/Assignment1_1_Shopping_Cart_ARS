/**
* Application class used for driving and show-casing the program.
*
* @author aross-sermons
* @version 1.0
* CS215; Lab #1.1
* Fall 2023
*/

public class Application {

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("###================================================================================###");
		System.out.println("This Shopping Cart program will demonstrate the functionality of an online shopping" +
				"\nsystem using a ShoppingCart, ResizableArrayBag, and multiple Item objects.\n");
		
		System.out.println("Instantiating Item objects to place into cart...");
		Item[] items = {new Item("Toothbrush", "China", 1.99, 2),
				new Item("Toothpaste", "America", 3.99, 5),
				new Item("Floss", "China", 0.99, 2),
				new Item("Mouthwash", "China", 6.78, 16),
				new Item("Lolipop", "Bolivia", 5.89, 1.5)};
		
		System.out.println("Instantiating new ShoppingCart myCart...");
		ShoppingCart myCart = new ShoppingCart();
		
		System.out.println("\nCalling myCart.addItem(items[0]), or \"Toothbrush\"");
		myCart.addItem(items[0]);
		System.out.println("\nCalling myCart.addItem(items[3]), or \"Mouthwash\"");
		myCart.addItem(items[3]);
		System.out.println("\nCalling myCart.addItem(items[4]), or \"Lolipop\"");
		myCart.addItem(items[4]);
		System.out.println("\nCalling myCart.addItem(items[1]), or \"Toothpaste\"");
		myCart.addItem(items[1]);
		System.out.println("\nCalling myCart.addItem(items[4]), or \"Lolipop\"");
		myCart.addItem(items[4]);
		System.out.println("\nCalling myCart.addItem(items[2]), or \"Floss\"");
		myCart.addItem(items[2]);
		
		System.out.println("\nCalling myCart.viewAll() to view every item in the cart...");
		myCart.viewAll();
		
		System.out.println("\nCalling myCart.indexOf(items[1]) or \"Toothpaste\": " + myCart.indexOf(items[1]));
		
		System.out.println("\nFrom now on, myCart.viewAll() will be called after each command"
				+ "\nto demonstrate the results.");
		
		System.out.println("\nCalling myCart.removeItem(items[2]) or \"Floss\"...");
		myCart.removeItem(items[2]);
		myCart.viewAll();
		
		System.out.println("\nCalling myCart.removeAnyItem()...");
		myCart.removeAnyItem();
		myCart.viewAll();
		
		System.out.println("\nCalling myCart.removeAll()...");
		myCart.removeAll();
		myCart.viewAll();
		
		System.out.println("\nCalling myCart.isEmpty()...\n" + myCart.isEmpty());
		
		System.out.println("\nCalling myCart.addItem(items[0]), or \"Toothbrush\": ");
		myCart.addItem(items[0]);
		System.out.println("\nCalling myCart.addItem(items[2]), or \"Floss\"");
		myCart.addItem(items[2]);
		System.out.println("\nCalling myCart.addItem(items[4]), or \"Lolipop\"");
		myCart.addItem(items[4]);
		System.out.println("\nCalling myCart.addItem(items[1]), or \"Toothpaste\"");
		myCart.addItem(items[1]);
		System.out.println("\nCalling myCart.addItem(items[4]), or \"Lolipop\"");
		myCart.addItem(items[4]);
		System.out.println("\nCalling myCart.addItem(items[2]), or \"Floss\"");
		myCart.addItem(items[2]);
		
		System.out.println("\nCalling myCart.viewAll() to view every item in the cart...");
		myCart.viewAll();
		
		System.out.println("\nCalling myCart.hasItem(items[0]) or \"Toothbrush\": " + myCart.hasItem(items[0]));
		System.out.println("Calling myCart.hasItem(items[3]) or \"Mouthwash\": " + myCart.hasItem(items[3]));
		
		System.out.println("\nCalling myCart.getFrequencyOf(items[2]) or \"Floss\": " + myCart.getFrequencyOf(items[2]));
		System.out.println("Calling myCart.getFrequencyOf(items[3]) or \"Mouthwash\": " + myCart.getFrequencyOf(items[3]));
		
		System.out.println("\nCalling myCart.getSize(): " + myCart.getSize());
		
		System.out.println("\nAPPLICATION END\n###================================================================================###");
	}//end main
}//end Application.java
