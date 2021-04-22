package org.howard.edu.lsp.exam.question41;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * JUnit test cases for removeZeroes
 * @author chidindu
 *
 */
class RemoveZerosTest {

	@Test
	@DisplayName("Test case for removeZeroes")
	public void testRemoveZeroes() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
        list.add(0);
        list.add(7);
        list.add(2);
        list.add(0);
        list.add(0);
        list.add(4);
        list.add(0);
        
        list2.add(7);
        list2.add(2);
        list2.add(4);
        
        RemoveZeros.removeZeroes(list);
		Assert.assertEquals("Error in removeZeroes, should return (7, 2, 4)", list2, list);
		
		
		list.clear();
		list2.clear();
		
		list.add(3);
        list.add(6);
        list.add(0);
        list.add(8);
        list.add(5);
        
        list2.add(3);
        list2.add(6);
        list2.add(8);
        list2.add(5);
        
        RemoveZeros.removeZeroes(list);
		Assert.assertEquals("Error in removeZeroes, should return (3, 6, 8, 5)", list2, list);
		
		
		list.clear();
		list2.clear();
		
		list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        
        RemoveZeros.removeZeroes(list);
		Assert.assertEquals("Error in removeZeroes, should return (3, 6, 8, 5)", list2, list);
		
	}

}
