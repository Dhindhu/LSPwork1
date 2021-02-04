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
 * Chidindu Alim
 */



