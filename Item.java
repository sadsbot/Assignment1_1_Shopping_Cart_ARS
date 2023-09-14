/**
* Class Description
*
* @author aross-sermons
* @version 1.0
* CS215; Lab #1.1
* Fall 2023
*/

public class Item implements ItemInterface{
	private String name;
	private String originCountry;
	private double price;
	private double weightGrams;
	
	public Item() {
		name = "";
		originCountry = "";
		price = 0;
		weightGrams = 0;
	}//end default constructor
	
	public Item(String name, String originCountry, double price, double weightGrams) {
		this.name = name;
		this.originCountry = originCountry;
		this.price = price;
		this.weightGrams = weightGrams;
	}//end preferred constructor

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}//end

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}//end

	/**
	 * @return the originCountry
	 */
	public String getOriginCountry() {
		return originCountry;
	}//end

	/**
	 * @param originCountry the originCountry to set
	 */
	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}//end

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}//end

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}//end

	/**
	 * Returns the price in the format "$0.00".
	 * @return the price
	 */
	public String getPriceFormatted() {
		return(String.format("$%.2f", price));
	}//end
	
	/**
	 * @return the weightGrams
	 */
	public double getWeightGrams() {
		return weightGrams;
	}//end

	/**
	 * @param weightGrams the weightGrams to set
	 */
	public void setWeightGrams(double weightGrams) {
		this.weightGrams = weightGrams;
	}//end

	@Override
	public void setCountryOfOrigin(String country) {
	}

	//Unimplemented
	@Override
	public double getWeightOz() {
		return 0;
	}
	
}//end Item.java
