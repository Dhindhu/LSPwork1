package org.howard.edu.assignment7.tollbooth;

/**
 * Reads the details of a truck from
 * it's bar code
 * @author chidindu
 *
 */
public class CodeReader {
	  /**
	   * Read the number of axles from the truck's bar code
	   * 
	   * @param truck Truck
	   * @return number of axles of truck
	   */
	  public int readNumAxles(Truck truck) {
	    return truck.getNumAxles();
	  }
	
	  
	  /**
	   * Read the weight of the truck from the bill of laden
	   * 
	   * @param truck Truck
	   * @return weight of truck
	   */
	  public int readWeight(Truck truck) {
	    return truck.getWeight();
	  }
}
