/**
* Interface defining a shopping cart ADT.
*
* @author aross-sermons
* @version 1.0
* CS215; Lab #0.3
* Fall 2023
*/

public interface ShoppingCartInterface {
	/**
	 * Adds an Item to this ShoppingCart.
	 * @param newItem
	 * @return success status
	 */
	public boolean addItem(Item newItem);
	
	/**
	 * Removes a matching Item from this ShoppingCart.
	 * @param anItem
	 * @return
	 */
	public boolean removeItem(Item anItem);
	
	/**
	 * Removes a random Item from this ShoppingCart.
	 */
	public Item removeAnyItem();
	
	/**
	 * Removes all Items from this ShoppingCart.
	 */
	public void removeAll();
	
	/**
	 * @return true if empty, otherwise false
	 */
	public boolean isEmpty();
	
	/**
	 * Prints all Item in this ShoppingCart.
	 */
	public void viewAll();
	
	/**
	 * Returns a requested Item if that Item is in this ShoppingCart.
	 * @param item
	 * @return the requested Item
	 */
	public int indexOf(Item item);
	
	/**
	 * @param item
	 * @return true if this ShoppingCart contains item, otherwise false
	 */
	public boolean hasItem(Item item);
	
	/**
	 * Returns an int value representing the number of times the specified item appears in this ShoppingCart.
	 * @param item
	 * @return the int number of times the item appears in this ShoppingCart
	 */
	public int getFrequencyOf(Item item);
	
	/**
	 * Returns the size or number of Item in this ShoppingCart.
	 * @return the int size
	 */
	public int getSize();
	
	/**
	 * Returns all Item in this ShoppingCart as an array of Item.
	 * @return the Item[]
	 */
	public Item[] toArray();
}//end
