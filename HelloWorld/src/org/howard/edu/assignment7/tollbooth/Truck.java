package org.howard.edu.assignment7.tollbooth;

/**
 * Truck's interface
 * @author chidindu
 *
 */
public abstract class Truck {
	  int numAxles;
	  int weight;
	  
	  Truck(int numAxles, int weight) {
	    this.numAxles = numAxles;
	    this.weight = weight;
	  }

	  /**
	   * Gets number of axles truck has
	   * @return number of axles 
	   */
	  public int getNumAxles() {
	    return this.numAxles;
	  }

	  /**
	   * Gets weight of the truck
	   * @return weight of truck
	   */
	  public int getWeight() {
	    return this.weight;
	  }
}
