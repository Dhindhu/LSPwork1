package org.howard.edu.assignment7.tollbooth;

public class NissanTruck extends Truck {
	private static String make = "Nissan";

	public NissanTruck(int numAxles, int weight) {
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
