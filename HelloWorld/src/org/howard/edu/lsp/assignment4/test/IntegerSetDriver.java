package org.howard.edu.lsp.assignment4.test;

import java.util.*;

import org.howard.edu.lsp.assignment4.implementation.IntegerSet;
import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;

/**
 * Driver class to test IntegerSet class 
 * @author Dhindhu
 */
public class IntegerSetDriver {
	/**
	 * 
	 * @param args String
	 * @throws IntegerSetException if set is empty and operation performed
	 */
	   public static void main(String[] args) throws IntegerSetException {
		   /*
		    * Create two ArrayLists to pass in values 
		    */
		   ArrayList<Integer> list1= new ArrayList<>();
		   ArrayList<Integer> list2= new ArrayList<>();
		     		     
		   /*
		    * Set the ArrayList to IntegerSet
		    */
		   IntegerSet set1= new IntegerSet(list1);
		   IntegerSet set2= new IntegerSet(list2);
		     
		   /*
		    * Test add, populate set1 with values
		    */
		   set1.add(1);
		   set1.add(3);
		   set1.add(5);
		   set1.add(6);
		   set1.add(17);
		   set1.add(4);
		   set1.add(35);
		     
		   /*
		    * Test add, populate set2 with values
		    */
		   set2.add(1);
		   set2.add(5);
		   set2.add(7);
		   set2.add(8);
		   set2.add(35);
		   set2.add(67);
		   set2.add(100);

		   /*
		    * check the length of both sets
		    */
		   int len1 = set1.length();
		   int len2 = set2.length();
		   
		   System.out.println("Set 1 : "+set1.getlist());
		   System.out.println("Set 2 : "+set2.getlist());
		   System.out.println("Length of set 1 is " + len1);
		   System.out.println("Length of set 2 is " + len2);
		   System.out.println("Set 1 has 8, true or false? " + set1.contains(8));
		   System.out.println("Set 1 has 7, true or false? " + set1.contains(7));
		   System.out.println("It is equal: " + set1.equals(set2));
		   System.out.println("The largest element in set1 is " + set1.largest());
		   System.out.println("The smallest element in set2 is " + set2.smallest());
		   
		   /*
		    * set1.clear();
		    */
		   
		   set2.remove(2);
		   set2.remove(4);
		   set2.remove(7);
		    
		 /*
		  * check the length of both sets
		  */
		   int len3 = set1.length();
		   int len4 = set2.length();
		   
		   System.out.println("Set 1 : "+set1.getlist());
		   System.out.println("Set 2 : "+set2.getlist());
		   System.out.println("Length of set 1 is " + len3);
		   System.out.println("Length of set 2 is " + len4);
		   System.out.println("Set 1 has 8, true or false? " + set1.contains(8));
		   System.out.println("Set 2 has 7, true or false? " + set1.contains(7));
		   System.out.println("It is equal: " + set1.equals(set2));
		   System.out.println("The largest element in set1 is " + set1.largest());
		   System.out.println("The smallest element in set2 is " + set2.smallest());
		   
		   /*
		    * set1.union(set2);		
		    * System.out.println("The union of both sets is " + set1.getlist() );     
		    */		   	
		   
		   /*
		    * set1.intersection(set2);		     
		    * System.out.println("The intersection of the sets is "+set1.getlist() );		  
		    */
		   
		   /*
		    * set1.difference(set2);  
		    * System.out.println("The difference is " + set1.getlist());
		    */
		     
		   
		   /*
		    * Results of tests below:
		    */
		   
		   /*
		    Set 1 : [0, 3, 4, 6, 9, 8, 10]
			Set 2 : [1, 2, 3, 4, 5, 7]
			Length of set 1 is 7
			Length of set 2 is 6
			Set 1 has 8, true or false? true
			Set 1 has 7, true or false? false
			Set 1 : []
			Set 2 : [1, 3, 5]
			Length of set 1 is 0
			Length of set 2 is 3
			Set 1 has 8, true or false? false
			Set 2 has 7, true or false? false
		    */
		   
		   /*
		    Set 1: [1, 6, 18, 78, 55, 4, 17]
			Set 2: [9, 5, 4, 8, 67, 14]
			It is equal: false
			The largest element in set1 is 78
			The smallest element in set2 is 4
			The union of both sets is [1, 17, 18, 67, 4, 5, 6, 55, 8, 9, 78, 14] 
			The intersection of the sets is [4]
			The difference is [1, 6, 18, 78, 55, 17]
		    */
		   
		   /*
		    Set 1 : [1, 3, 5, 6, 17, 4, 35]
			Set 2 : [1, 5, 7, 8, 35, 67, 100]
			Length of set 1 is 7
			Length of set 2 is 7
			Set 1 has 8, true or false? false
			Set 1 has 7, true or false? false
			It is equal: false
			The largest element in set1 is 35
			The smallest element in set2 is 1
			Set 1 : []
			Set 2 : [1, 5, 8, 35, 67, 100]
			Length of set 1 is 0
			Length of set 2 is 6
			Set 1 has 8, true or false? false
			Set 2 has 7, true or false? false
			It is equal: false
			Exception in thread "main" org.howard.edu.lsp.assignment4.implementation.IntegerSetException
				at org.howard.edu.lsp.assignment4.implementation.IntegerSet.largest(IntegerSet.java:92)
				at org.howard.edu.lsp.assignment4.test.IntegerSetDriver.main(IntegerSetDriver.java:74)
		    */

		         
		      }
}
