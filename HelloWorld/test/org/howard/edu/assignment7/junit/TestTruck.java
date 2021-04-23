package org.howard.edu.assignment7.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.howard.edu.assignment7.tollbooth.NissanTruck;
import org.howard.edu.assignment7.tollbooth.DaewooTruck;
import org.howard.edu.assignment7.tollbooth.Truck;
import org.junit.jupiter.api.DisplayName;

public class TestTruck {

  @Test
  @DisplayName("Test case for getNumAxles")
  void testGetNumAxles() {
    Truck nissanTruck = new NissanTruck(6, 15000);
    assertEquals(nissanTruck.getNumAxles(), 6);
    Truck daewooTruck = new DaewooTruck(4, 10000);
    assertEquals(daewooTruck.getNumAxles(), 4);
  }

  @Test
  @DisplayName("Test case for getWeight")
  void testGetWeight() {
    Truck nissanTruck = new NissanTruck(6, 15000);
    assertEquals(nissanTruck.getWeight(), 15000);
    Truck daewooTruck = new DaewooTruck(4, 10000);
    assertEquals(daewooTruck.getWeight(), 10000);
  }

}