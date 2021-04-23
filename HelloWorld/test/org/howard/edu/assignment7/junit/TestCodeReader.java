package org.howard.edu.assignment7.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.howard.edu.assignment7.tollbooth.CodeReader;
import org.howard.edu.assignment7.tollbooth.NissanTruck;
import org.howard.edu.assignment7.tollbooth.DaewooTruck;
import org.howard.edu.assignment7.tollbooth.Truck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestCodeReader {

  CodeReader codeReader;

  @BeforeEach
  void newReader() {
    codeReader = new CodeReader();
  }

  @Test
  @DisplayName("Test cases for readNumAxles")
  void testReadNumAxles() {
    Truck fTruck = new NissanTruck(5, 10000);
    assertEquals(codeReader.readNumAxles(fTruck), 5);
    Truck ramTruck = new DaewooTruck(4, 25000);
    assertEquals(codeReader.readNumAxles(ramTruck), 4);
  }

  @Test
  @DisplayName("Test cases for readWeight")
  void testReadWeight() {
    Truck fTruck = new NissanTruck(5, 10000);
    assertEquals(codeReader.readWeight(fTruck), 10000);
    Truck ramTruck = new DaewooTruck(4, 25000);
    assertEquals(codeReader.readWeight(ramTruck), 25000);
  }

}