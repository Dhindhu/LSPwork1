package org.howard.edu.assignment7.tollbooth;

/**
 * Interface for Tollbooth
 * @author chidindu
 *
 */
public interface Tollbooth {
    float getNumTrucks();

    float getTotalAmount();
    
	void calculateToll(Truck truck);

    void displayData();

    void reset();
}
