/**
* Class Description
*
* @author aross-sermons
* @version 1.0
* CS215; Lab #1.1
* Fall 2023
*/

public class ShoppingCart implements ShoppingCartInterface {
	
	ResizableArrayBag<Item> bag;
	
	/**
	 * Default Constructor
	 */
	public ShoppingCart() {
		bag = new ResizableArrayBag<Item>();
	}//end
	
	/**
	 * Preferred constructor for setting starting size.
	 * @param initialCapacity
	 */
	public ShoppingCart(int initialCapacity) {
		bag = new ResizableArrayBag<Item>(initialCapacity);
	}//end
	
	/**
	 * Preferred constructor for setting starting items.
	 * @param contents
	 */
	public ShoppingCart(Item[] contents) {
		bag = new ResizableArrayBag<Item>(contents);
	}//end

	/**
	 * Adds the specified Item to this ShoppingCart.
	 * returns true if successful, otherwise false
	 * @param 
	 */
	@Override
	public boolean addItem(Item newItem) {
		return bag.add(newItem);
	}//end

	/**
	 * Removes the specified item from this ShoppingCart.
	 * returns true if successful, otherwise false
	 * @param anItem
	 * @return
	 */
	@Override
	public boolean removeItem(Item anItem) {
		return bag.remove(anItem);
	}//end

	/**
	 * Removes any Item from this ShoppingCart.
	 * returns the removed Item if successful, otherwise null
	 */
	@Override
	public Item removeAnyItem() {
		return bag.remove();
	}//end

	/**
	 * Removes every Item from this ShoppingCart.
	 */
	@Override
	public void removeAll() {
		bag.clear();
	}//end

	/**
	 * @return true if the cart is empty, otherwise false
	 */
	@Override
	public boolean isEmpty() {
		return bag.isEmpty();
	}//end

	/**
	 * Appends the information of every item in this ShoppingCart
	 * to a StringBuilder and prints that StringBuilder.toString().
	 */
	@Override
	public void viewAll() {
		Item[] cartArray = toArray();
		StringBuilder sb = new StringBuilder("--------All Cart Items--------");
		for(int i = 0; i < cartArray.length; i++) {
			sb.append("\n\nName: " + cartArray[i].getName());
			sb.append("\nCountry of Origin: " + cartArray[i].getOriginCountry());
			sb.append("\nWeight: " + cartArray[i].getWeightGrams() + "g");
			sb.append("\nPrice: " + cartArray[i].getPriceFormatted());
		}
		sb.append("\n\n------------------------------");
		System.out.println(sb.toString());
	}//end

	/**
	 * @return i the index of item
	 */
	@Override
	public int indexOf(Item item) {
		Item[] cartArray = toArray();
		for(int i = 0; i < cartArray.length; i++) {
			if(cartArray[i] == item)return i;
		}
		return -1;
	}//end

	/**
	 * Checks to see if the given Item is in this ShoppingCart.
	 * @param item the item to check
	 * @return true if the item exists, otherwise false
	 */
	@Override
	public boolean hasItem(Item item) {
		return bag.contains(item);
	}//end

	/**
	 * Checks how many of a given Item are in this ShoppingCart.
	 * @param item the item to check
	 * @return the frequency
	 */
	@Override
	public int getFrequencyOf(Item item) {
		return bag.getFrequencyOf(item);
	}//end

	/**
	 * @return the size of this ShoppingCart
	 */
	@Override
	public int getSize() {
		return bag.getCurrentSize();
	}//end

	/**
	 * Returns this ShoppingCarts contents as an array.
	 * @return the Item[]
	 */
	@Override
	public Item[] toArray() {
		Object[] rawCartArray = bag.toArray();
		Item[] cartArray = new Item[rawCartArray.length];
		for(int i = 0; i < rawCartArray.length; i++) {
			cartArray[i] = (Item)rawCartArray[i];
		}
		return cartArray;
	}//end
}//end ShoppingCart.java
