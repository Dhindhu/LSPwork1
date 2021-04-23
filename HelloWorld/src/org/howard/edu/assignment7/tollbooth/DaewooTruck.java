package org.howard.edu.assignment7.tollbooth;

public class DaewooTruck extends Truck {
	private static String make = "Daewoo";

	public DaewooTruck(int numAxles, int weight) {
	    super(numAxles, weight);
    }

	/**
	 * Gets truck make
	 * @return truck make
	 */
	public static String getMake() {
	  return make;
	}
}
