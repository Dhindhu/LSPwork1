package org.howard.edu.lsp.assignment4.implementation;

import java.util.*;
import java.util.stream.Collectors;

/*
 * Creating a class which creates two lists, and carries
 * out operations on the lists such as adding, removing, getting 
 * the union, intersection and difference between the lists.
 * @author: Dhindhu
 */


public class IntegerSet {
	//Creates set and is private so the value cannot be tampared with
   private ArrayList<Integer> set= new ArrayList<Integer>();
   
   //Constructor to pass lists into set type
   public IntegerSet(ArrayList<Integer> list) {
       this.set = list;
   }
  
   //Clears the internal representation of the set
   public void clear() {
       set.clear();
   }
   
  
   //Returns the length of the set 
   public int length() {
       return set.size();
   }
   
  
	/*
	* Returns true if the 2 sets are equal, false otherwise;
	* Two sets are equal if they contain all of the same values in ANY order.
	* @param IntegerSet, b is passed in set
	*/
   public boolean equals(IntegerSet b) {
      //Pass list b as private set 
       ArrayList<Integer> intSetb = b.set;
         
       //if length of both sets are not the same, equals is false
       if(set.size()!=intSetb.size()) {
           return false;
       }
         
       //create new variable/duplicates for both sets
       //since they will be modified
       ArrayList<Integer> tempOne = set;	         
       ArrayList<Integer> tempTwo = intSetb;
        
       //sort both sets in the same order so as to quickly 
       //and easily check if they are the same
       Collections.sort(tempOne);
       Collections.sort(tempTwo);
         
       //iterate through both sets and return false if 
       //the values at each index aren't the same
       for (int i=0; i<tempOne.size(); i++) {
           if (tempOne.get(i) != tempTwo.get(i)) {
               return false;
           }
       }
       //if we get here then lists must be equal, return true
       return true;     
   }
   
   
   //Returns true if the set contains the value, otherwise false
   //@param value is of integer type
   public boolean contains(int value) {
	   //iterate through the set and check each number against the target value
	   for (int i=0; i<set.size(); i++) {
		   if (set.get(i) == value) {
			   return true;
		   }
	   }
	   //if no number was the target number, return false
	   return false;
   };    

  
  
   //Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
   public int largest() throws IntegerSetException {
      
       if(set.size() == 0) {
    	   //created IntegerSetException class, which throws 
    	   //exception if set is empty
    	   IntegerSetException e = new IntegerSetException();
           throw e;
       }
       //max is our checker. We set it to 0 to not overlook any number 
       int max = 0;
      
       //Iterate through the set and check if the number is bigger than max.
       //If bigger, update max to that number
       for(int i=0; i<set.size(); i++) {
           if(set.get(i) > max) {
               max=set.get(i);
           }
       }
       //After iterating through the set, return whatever value max is, that is the highest value.
       return max;      
   }
  

   //Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
   public int smallest() throws IntegerSetException {
	   //created IntegerSetException class, which throws 
	   //exception if set is empty
       if(set.size() == 0) {
    	   IntegerSetException e = new IntegerSetException();
           throw e;
       }
       //variable min has the highest integer value possible
       //this will be used to check through the set
       int min = Integer.MAX_VALUE;
      
       //Iterate through the set and if the number is less than min, update min to the number.
       //This helps us get the minimum value
       for(int i=0; i<set.size(); i++) {
           if(set.get(i) < min) {
               min = set.get(i);
           }
       }
      //After iterating through the set, return whatever value min has
       return min;     
   }
  

   //Adds an item to the set or does nothing it already there	
   public void add(int item){
      //ifIs is a boolean set to false
	  //it's value only changes if a number to be added is already in the set
       boolean ifIs = false;
      
       //check if target number is already in set
       for(int i=0; i<set.size(); i++){
           if(set.get(i) == item){
               ifIs = true;
           }
       }
      //if the number isn't in the set, we add it to the set
      //this prevents having duplicates in the set
       if(ifIs == false) {
    	   set.add(item);
       }	      
   }
  

   //Removes an item from the set or does nothing if not there
   public void remove(int item){
      //checks if the target number is in the set
	   //if present, removes it from the set
       for(int i=0; i<set.size(); i++){         
           if(set.get(i) == item){
        	   set.remove(i);
           }
       } 
   }
  

   //Set union
   public void union(IntegerSet intSetb) {
      //temp gets the set of intSetb
       ArrayList<Integer> temp = intSetb.getlist();
      
       //create set variable store which will store both set temporarily
       Set<Integer> store = new HashSet<>();
       
       //add set and temp values in store
       store.addAll(set);
       store.addAll(temp);
       
       //clear set to input the values in store
       set.clear();
       set.addAll(store);
       
       return;
      
   }
  
   
// Set intersection
   public void intersection(IntegerSet intSetb) {
      //temp gets the set of intSetb
       ArrayList<Integer> temp = intSetb.getlist();
      
       //keep the values that are in both set and temp 
       set.retainAll(temp);
      
       return;
   }
  

// Set difference, i.e., s1 –s2
   public void difference (IntegerSet intSetb) {
	 //temp gets the set of intSetb
       ArrayList<Integer> temp = intSetb.getlist();
      
       // Remove all elements in temp from set
       set.removeAll(temp);
      
       return;
      
   }
   
   
// Returns true if the set is empty, false otherwise
   boolean isEmpty() {
	   //if the length of the set is 0, we know it's empty
	   if (set.size() == 0){
		   return true;
	   }
	   
	   return false;
   }
 
   
// Return String representation of your set
   public String toString() {
	   //converts the integers in set to strings and joins them all together
	   String setString = set.stream().map(Object::toString).collect(Collectors.joining(", "));   
	   
	   return setString;
   }
     
 
// Returns set
   public ArrayList<Integer> getlist(){
       return set;
   }
}
