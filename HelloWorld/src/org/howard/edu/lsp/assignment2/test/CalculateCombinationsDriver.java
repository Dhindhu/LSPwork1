package org.howard.edu.lsp.assignment2.test;

import java.util.Arrays;
import org.howard.edu.lsp.assignment2.combination.CalculateCombinations;

/* 
 * Driver class to test CalculateCombinations class 
 * 
 * @author Dhindhu
 */

public class CalculateCombinationsDriver{
	
	/* 
	 * Tests are carried out in the main function
	 */
    public static void main(String args[]){
    	for (int i = 0; i<6; ++i) {
    		if (i == 0) {
    	        int arr[] = {1,2,3,4,5,6};
    	        int z = arr.length;
    	        int sum = 6;
    	        System.out.println("");
    	        System.out.println("Inputed array: " +Arrays.toString(arr));
    	        System.out.println("Targeted sum: " +sum);
    	        System.out.println("All possible combinations below: ");
    	        CalculateCombinations.combinationSubsets(arr, z, sum);
    	    }
    		if (i == 1) {
    	        int arr[] = {1,2,3,4,5,6};
    	        int z = arr.length;
    	        int sum = 15;
    	        System.out.println("");
    	        System.out.println("Inputed array: " +Arrays.toString(arr));
    	        System.out.println("Targeted sum: " +sum);
    	        System.out.println("All possible combinations below: ");
    	        CalculateCombinations.combinationSubsets(arr, z, sum);
    	    }
    		if (i == 2) {
    	        int arr[] = {6, 6};
    	        int z = arr.length;
    	        int sum = 15;
    	        System.out.println("");
    	        System.out.println("Inputed array: " +Arrays.toString(arr));
    	        System.out.println("Targeted sum: " +sum);
    	        System.out.println("All possible combinations below: ");
    	        CalculateCombinations.combinationSubsets(arr, z, sum);
    	    }
    		if (i == 3) {
    	        int arr[] = {0, 1, 5, 22};
    	        int z = arr.length;
    	        int sum = 12;
    	        System.out.println("");
    	        System.out.println("Inputed array: " +Arrays.toString(arr));
    	        System.out.println("Targeted sum: " +sum);
    	        System.out.println("All possible combinations below: ");
    	        CalculateCombinations.combinationSubsets(arr, z, sum);
    	    }
    		if (i == 4) {
    	        int arr[] = {6, 6, 6, 6};
    	        int z = arr.length;
    	        int sum = 6;
    	        System.out.println("");
    	        System.out.println("Inputed array: " +Arrays.toString(arr));
    	        System.out.println("Targeted sum: " +sum);
    	        System.out.println("All possible combinations below: ");
    	        CalculateCombinations.combinationSubsets(arr, z, sum);
    	    } 
    		if (i == 5) {
    	        int arr[] = {70, 11, 6, 22};
    	        int z = arr.length;
    	        int sum = 22;
    	        System.out.println("");
    	        System.out.println("Inputed array: " +Arrays.toString(arr));
    	        System.out.println("Targeted sum: " +sum);
    	        System.out.println("All possible combinations below: ");
    	        CalculateCombinations.combinationSubsets(arr, z, sum);
    	    }
    	}
    }
}
/*
 * Inputed array: [1, 2, 3, 4, 5, 6]
 * Targeted sum: 6
 * All possible combinations below: 
 * [2, 1, 0]
 * [3, 1]
 * [4, 0]
 * [5]
 * 
 * Inputed array: [1, 2, 3, 4, 5, 6]
 * Targeted sum: 15
 * All possible combinations below: 
 * [4, 3, 2, 1, 0]
 * [5, 3, 2, 1]
 * [5, 4, 2, 0]
 * [5, 4, 3]
 * 
 * Inputed array: [6, 6]
 * Targeted sum: 15
 * All possible combinations below:
 * There are no combinations with sum 15
 * 
 * Inputed array: [0, 1, 5, 22]
 * Targeted sum: 12
 * All possible combinations below: 
 * There are no combinations with sum 12
 * 
 * Inputed array: [70, 11, 6, 22]
 * Targeted sum: 22
 * All possible combinations below: 
 * [3]
 * 
 * Inputed array: [6, 6, 6, 6]
 * Targeted sum: 6
 * All possible combinations below: 
 * [0]
 * [1]
 * [2]
 * [3]
 */

/*
 * Chidindu Alim
 */



