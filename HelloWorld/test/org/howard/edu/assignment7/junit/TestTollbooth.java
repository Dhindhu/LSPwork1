package org.howard.edu.assignment7.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.howard.edu.assignment7.tollbooth.YoloTollbooth;
import org.howard.edu.assignment7.tollbooth.NissanTruck;
import org.howard.edu.assignment7.tollbooth.DaewooTruck;
import org.howard.edu.assignment7.tollbooth.Tollbooth;
import org.howard.edu.assignment7.tollbooth.Truck;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestTollBooth {
	  Tollbooth yoloTollbooth;
	
	  private final static ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	  private final static PrintStream originalOut = System.out;
	
	  @BeforeAll
	  public static void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	  }
	
	  @AfterAll
	  public static void restoreStreams() {
	    System.setOut(originalOut);
	  }
	
	  @BeforeEach
	  void newBooth() {
	    yoloTollbooth = new YoloTollbooth();
	    outContent.reset();
	  }
	
	
	  @Test
	  @DisplayName("Test case for calculateToll")
	  void testCalculateToll() {
	    Truck nissanTruck = new NissanTruck(4, 5000);
	    yoloTollbooth.calculateToll(nissanTruck);
	    assertEquals(yoloTollbooth.getNumTrucks(), 1);
	    assertEquals(yoloTollbooth.getTotalAmount(), 120.00);
	    assertEquals("Truck Arrival - Axles: 4 Total weight: 5000 Toll due: $120.00",
	        outContent.toString().trim());
	
	    Truck daewooTruck = new DaewooTruck(2, 15000);
	    yoloTollbooth.calculateToll(daewooTruck);
	    assertEquals(yoloTollbooth.getNumTrucks(), 2);
	    assertEquals(yoloTollbooth.getTotalAmount(), 430.00);
	  }
	
	  @Test
	  @DisplayName("Test case for displayData")
	  void testDisplayData() {
	    Truck nissanTruck = new NissanTruck(4, 5000);
	    yoloTollbooth.calculateToll(nissanTruck);
	    outContent.reset();
	    yoloTollbooth.displayData();
	    assertEquals("Totals since last collection - Receipts: $120.00 Trucks: 1",
	        outContent.toString().trim());
	    Truck daewooTruck = new DaewooTruck(2, 15000);
	    yoloTollbooth.calculateToll(daewooTruck);
	    outContent.reset();
	    yoloTollbooth.displayData();
	    assertEquals("Totals since last collection - Receipts: $430.00 Trucks: 2",
	        outContent.toString().trim());
	  }
	
	  @Test
	  @DisplayName("Test case for reset")
	  void testReset() {
	    Truck nissanTruck = new NissanTruck(4, 5000);
	    yoloTollbooth.calculateToll(nissanTruck);
	    Truck daewooTruck = new DaewooTruck(2, 15000);
	    yoloTollbooth.calculateToll(daewooTruck);
	    outContent.reset();
	    yoloTollbooth.reset();
	    String output = outContent.toString().trim();
	    assertTrue(("*** Collecting receipts  ***\r\n"
	        + "Totals since last collection - Receipts: $430.00 Trucks: 2").equals(output)
	        || ("*** Collecting receipts  ***\n"
	            + "Totals since last collection - Receipts: $430.00 Trucks: 2").equals(output));
	    assertEquals(yoloTollbooth.getTotalAmount(), 0);
	    assertEquals(yoloTollbooth.getNumTrucks(), 0);
	  }
}
