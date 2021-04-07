package org.howard.edu.lsp.assignment6.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.howard.edu.lsp.assignment6.integerset.IntegerSetException;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit tests to test IntegerSet class 
 * @author Dhindhu
 */
class IntegerSetTest {
	/*
	* Create ArrayLists to pass in values 
	*/
	ArrayList<Integer> list1= new ArrayList<>();
	ArrayList<Integer> list2= new ArrayList<>();
	ArrayList<Integer> list3= new ArrayList<>();
	     		     
    /*
    * Set the ArrayList to IntegerSet
    */
    IntegerSet set1= new IntegerSet(list1);
    IntegerSet set2= new IntegerSet(list2);
    IntegerSet set3= new IntegerSet(list3);
    
    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
    	set1.add(1);
	    set1.add(3);
	    set1.add(5);
	    set1.add(6);
	    String checker = "1, 3, 5, 6";
	    assertEquals( "error in add(), should return 1, 3, 5, 6", checker, set1.toString());
	    
	    set1.add(77);
	    String checker2 = "1, 3, 5, 6, 77";
	    assertEquals("error in add(), should return 1, 3, 5, 6, 77", checker2, set1.toString());
    }
    
    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
    	set1.add(1);
	    set1.add(3);
	    set1.add(5);
	    set1.add(6);
	    
	    set1.remove(3);
	    set1.remove(6);
	    String checker = "1, 5";
	    assertEquals("error in remove(), should return 1, 5", checker, set1.toString());
	    
	    set1.remove(1);
	    set1.remove(5);
	    assertTrue(set1.isEmpty(), "error in remove(), should return True");
    }
    
    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
    	set1.add(1);
	    set1.add(3);
	    set1.add(5);
	    set1.add(6);
	    
	    set1.clear();
	    assertTrue(set1.isEmpty(), "error in remove(), should return True");
	    
	    set1.add(2);
	    set1.add(5);
	    set1.add(60);
	    set1.clear();
	    assertEquals("error in clear, should []", set3.getlist(), set1.getlist());
    }
    
    @Test
    @DisplayName("Test case for length")
    public void testLength() {
    	set1.add(1);
	    set1.add(3);
	    set1.add(5);
	    set1.add(6);
	    int checker = 4;
	    assertEquals("error in length(), should return 4", checker, set1.length());
	    
	    set1.clear();
	    int checker2 = 0;
	    assertEquals("error in length(), should return 0", checker2, set1.length());
    }

	@Test
	@DisplayName("Test case for equals")
	public void testEquals() {
		set1.add(1);
	    set1.add(3);
	    set1.add(5);
	    set1.add(6);
	    set1.add(17);
	    set1.add(4);
	    set1.add(35);
	    
	    set2.add(6);
		set2.add(3);
	    set2.add(35);
	    set2.add(17);
	    set2.add(4);
	    set2.add(5);
	    set2.add(1);
	    assertTrue(set1.equals(set2), "error in equals(), should return True");
	    
	    set2.remove(17);
	    assertFalse(set1.equals(set2), "error in equals(), should return False");
	    
	    set1.clear();
	    set2.clear();
	    
	    set1.add(1);
	    set1.add(8);
	    set1.add(5);
	    set1.add(9);
	    set1.add(97);
	    
	    set2.add(7);
	    set2.add(0);
	    set2.add(9);
	    set2.add(23);
	    set2.add(16);
	    assertFalse(set1.equals(set2), "error in equals(), should return False");
	}
	
	@Test
	@DisplayName("Test case for contains")
	public void testContains() {
		set1.add(1);
	    set1.add(3);
	    set1.add(5);
	    set1.add(96);
	    set1.add(17);
	    set1.add(4);
	    set1.add(35);
	    assertTrue(set1.contains(5), "error in contains(), should return True");
	    assertTrue(set1.contains(17), "error in contains(), should return True");
	    
	    assertFalse(set1.contains(0), "error in contains(), should return False");
	    assertFalse(set1.contains(13), "error in contains(), should return False");
	    assertFalse(set1.contains(9), "error in contains(), should return False");
	}
	
	@Test
	@DisplayName("Test case for largest")
	public void testLarger() throws IntegerSetException {
		set1.add(0);
	    set1.add(13);
	    set1.add(5);
	    set1.add(96);
	    set1.add(34);
	    set1.add(42);
	    set1.add(19);
	    assertEquals(96, set1.largest(), "error in largest(), should return 96");
	    
	    set1.clear();
	    assertThrows(IntegerSetException.class, () -> set1.smallest());
	    
	    set1.add(12);
	    set1.add(66);
	    set1.add(50);
	    set1.add(66);
	    assertEquals(66, set1.largest(), "error in largest(), should return 66");
	}
	
	@Test
	@DisplayName("Test case for smallest")
	public void testSmallest() throws IntegerSetException {
		set1.add(12);
	    set1.add(66);
	    set1.add(50);
	    set1.add(66);
	    assertEquals(12, set1.smallest(), "error in smallest(), should return 12");
	    
	    set1.clear();
	    assertThrows(IntegerSetException.class, () -> set1.smallest());
	    
	    set1.add(18);
	    set1.add(2);
	    set1.add(0);
	    set1.add(24);
	    set1.add(9);
	    set1.add(19);
	    assertEquals(0, set1.smallest(), "error in smallest(), should return 0");
	}
	
	@Test
	@DisplayName("Test case for union")
	public void testUnion() {
		set1.add(12);
	    set1.add(66);
	    set1.add(50);
	    set1.add(66);
	    
	    set2.add(12);
	    set2.add(66);
	    set2.add(50);
	    set2.add(66);
	    
	    set3.add(66);
	    set3.add(50);
	    set3.add(12);
	    set1.union(set2);
	    Assert.assertEquals("error in union(), should return [66, 50, 12]", set3.getlist(), set1.getlist());
	    
	    set1.clear();
	    set2.clear();
	    set3.clear();
	    
	    set1.add(1);
	    set1.add(6);
	    set1.add(5);
	    set1.add(80);
	    
	    set2.add(2);
	    set2.add(6);
	    set2.add(14);
	    set2.add(22);
	    
	    set3.add(80);
	    set3.add(1);
	    set3.add(2);
	    set3.add(5);
	    set3.add(6);
	    set3.add(22);
	    set3.add(14);
	    set1.union(set2);
	    Assert.assertEquals("error in union(), should return [80, 1, 2, 5, 6, 22, 14]", set3.getlist(), set1.getlist());
	}
	
	@Test
	@DisplayName("Test cases for intersection/")
	public void testIntersection() {
		set1.add(12);
	    set1.add(66);
	    set1.add(50);
	    set1.add(66);
	    
	    set2.add(12);
	    set2.add(66);
	    set2.add(50);
	    set2.add(66);
	    
	    set3.add(12);
	    set3.add(66);
	    set3.add(50);
	    set1.intersection(set2);
	    Assert.assertEquals("error in intersection(), should return [12, 66, 50]", set3.getlist(), set1.getlist());
	    
	    set1.clear();
	    set2.clear();
	    set3.clear();
	    
	    set1.add(1);
	    set1.add(6);
	    set1.add(5);
	    set1.add(80);
	    
	    set2.add(2);
	    set2.add(6);
	    set2.add(14);
	    set2.add(22);
	    
	    set3.add(6);
	    set1.intersection(set2);
	    Assert.assertEquals("error in intersection(), should return [6]", set3.getlist(), set1.getlist());
	    
	    set1.clear();
	    set2.clear();
	    set3.clear();
	    
	    set1.add(2);
	    set1.add(5);
	    set1.add(60);
	    
	    set2.add(7);
	    set2.add(90);
	    set2.add(4);
	    set1.intersection(set2);
	    Assert.assertEquals("error in intersection(), should return []", set3.getlist(), set1.getlist());
	}
	
	@Test
	@DisplayName("Test case for difference")
	public void testDifference() {
		set1.add(12);
	    set1.add(66);
	    set1.add(50);
	    set1.add(66);
	    
	    set2.add(12);
	    set2.add(66);
	    set2.add(50);
	    set2.add(66);
	    
	    set1.difference(set2);
	    Assert.assertEquals("error in difference(), should return []", set3.getlist(), set1.getlist());
	    
	    set1.clear();
	    set2.clear();
	    
	    set1.add(1);
	    set1.add(6);
	    set1.add(5);
	    set1.add(80);
	    
	    set2.add(2);
	    set2.add(6);
	    set2.add(14);
	    set2.add(22);
	    
	    set3.add(1);
	    set3.add(5);
	    set3.add(80);
	    set1.difference(set2);
	    Assert.assertEquals("error in difference(), should return [1, 5, 80]", set3.getlist(), set1.getlist());
	    
	    set1.clear();
	    set2.clear();
	    set3.clear();
	    
	    set1.add(2);
	    set1.add(5);
	    set1.add(60);
	    
	    set2.add(7);
	    set2.add(90);
	    set2.add(4);
	    
	    set3.add(2);
	    set3.add(5);
	    set3.add(60);
	    set1.difference(set2);
	    Assert.assertEquals("error in difference(), should return [2, 5, 60]", set3.getlist(), set1.getlist());
	}
	
	@Test
	@DisplayName("Test case for isEmpty")
	public void testIsEmpty() {
		set1.add(2);
	    set1.add(5);
	    set1.add(60);
	    assertFalse(set1.isEmpty(), "error in isEmpty(), should return False");
	    
	    set1.clear();
	    assertTrue(set1.isEmpty(), "error in isEmpty(), should return True");
	}
	
	@Test
	@DisplayName("Test case for toString")
	public void testToString() {
		set1.add(2);
	    set1.add(5);
	    set1.add(60);
	    String setreal = set1.toString();
	    String set = "2, 5, 60";
	    assertEquals("error in toString(), should return a string", set, setreal);
	}
}
