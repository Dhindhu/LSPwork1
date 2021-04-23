package org.howard.edu.assignment7.tollbooth;

/**
 * Tollbooth for Yolo county
 * @author chidindu
 *
 */
public class YoloTollbooth implements Tollbooth {
	  CodeReader reader;
	  DisplayScreen screen;
	  float totalAmount;
	  int numTrucks;

	  public YoloTollbooth() {
	    reader = new CodeReader();
	    totalAmount = 0;
	    numTrucks = 0;
	    screen = new DisplayScreen();
	  }

	  
	  /**
	   * Gets the total amount collected since last reset
	   * @return total amount collected by toll booth
	   */
	  @Override
	  public float getTotalAmount() {
	    return totalAmount;
	  }

	  
	  /**
	   * Gets total number of trucks since last reset
	   * @return total number of trucks 
	   */
	  @Override
	  public float getNumTrucks() {
	    return numTrucks;
	  }

	  
	  /**
	   * Calculate total amount due of arriving truck
	   * 
	   * @param truck arriving truck
	   */
	  @Override
	  public void calculateToll(Truck truck) {
	    int weight = reader.readWeight(truck);
	    int numAxles = reader.readNumAxles(truck);
	    float tollDue = 5 * numAxles + 10 * (weight / 500);
	    numTrucks++;
	    totalAmount += tollDue;
	    displayArrivalTruck(numAxles, weight, tollDue);
	  }
	  

	  /**
	   * Displays information about truck arriving at toll booth
	   * 
	   * @param numAxles number of axles of truck arriving
	   * @param weight weight of truck arriving
	   * @param tollDue toll amount due of truck arriving
	   */
	  private void displayArrivalTruck(int numAxles, int weight, float tollDue) {
	    screen.display("Truck Arrival - Axles: " + numAxles + " Total weight: " + weight
	        + " Toll due: $" + String.format("%.2f", tollDue));
	  }


	  /**
	   * Display truck total and tollbooth due
	   *
	   */
	  @Override
	  public void displayData() {
	    screen.display("Totals since last collection - Receipts: $"
	        + String.format("%.2f", this.totalAmount) + " Trucks: " + this.numTrucks);
	  }

	  
	  /**
	   * Reset all tollbooth
	   *
	   */
	  @Override
	  public void reset() {
	    screen.display("*** Collecting receipts  ***");
	    displayData();
	    totalAmount = 0;
	    numTrucks = 0;
	  }
}
