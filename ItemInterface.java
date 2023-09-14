/**
* Interface defining an item ADT.
*
* @author aross-sermons
* @version 1.0
* CS215; Lab #0.3
* Fall 2023
*/

public interface ItemInterface {
	/**
	 * Sets the name of this Item.
	 * @param name
	 */
	public void setName(String name);
	
	/**
	 * Sets the originCountry of this Item.
	 * @param country
	 */
	public void setCountryOfOrigin(String country);
	
	/**
	 * Sets the price of this Item.
	 * @param price
	 */
	public void setPrice(double price);
	
	/**
	 * Sets the weight of this Item.
	 * @param weight
	 */
	public void setWeightGrams(double weight);
	
	/**
	 * Returns the name of this Item.
	 * @return the name
	 */
	public String getName();
	
	/**
	 * Returns the price of this Item.
	 * @return the price
	 */
	public double getPrice();
	
	/**
	 * Returns the formatted price of this Item.
	 * @return the formatted price
	 */
	public String getPriceFormatted();
	
	/**
	 * Returns the weight of this Item in grams.
	 * @return the weight
	 */
	public double getWeightGrams();
	
	/**
	 * Returns the weight of this Item in ounces.
	 * @return the weight
	 */
	public double getWeightOz();
}//end
