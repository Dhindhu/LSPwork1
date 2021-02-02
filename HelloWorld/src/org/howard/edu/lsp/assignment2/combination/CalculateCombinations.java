package org.howard.edu.lsp.assignment2.combination;

import java.util.ArrayList;

/*
 * Creating a class which calculates all possible given 
 * integers in an array that can sum a given target number
 * 
 * @author: Dhindhu
 */

public class CalculateCombinations {	
	
   /* 
    * bool[i][j] will be True if the sum j is possible with 0 to i.
    */
   static boolean[][] bool;

   /*
    * @param x is an array of integers
    */
   static void display(ArrayList<Integer> x){
       System.out.println(x);
   }

   /*  
    * Function to recursively print all subsets using bool[][]
    * Current subset is stored in curr.
    * 
    * @param bool is a vector
    * @param arr is the inputed array
    * @param i is an element of bool
    * @param sum is a counter
    * @param curr is an array of current subset 
    */
   static void recurCombination(int arr[], int i, int sum, ArrayList<Integer> curr){
	   
	   /* 
	    * If at the end the sum is not 0 
	    */
       if (i == 0 && sum != 0 && bool[0][sum]){
           curr.add(i);
           display(curr);
           curr.clear();
           return;
       }

       /* 
        * If the sum is 0 
        */
       if (i == 0 && sum == 0){
           display(curr);
           curr.clear();
           return;
       }

       /* 
        * If looking over the current indx gives us the sum,
        * we make a new vector and store it 
        */
       if (bool[i-1][sum]){ 
           ArrayList<Integer> y = new ArrayList<>();
           y.addAll(curr);
           recurCombination(arr, i-1, sum, y);
       }

       /* 
        * On the other hand, if considering the indx gives us the sum 
        */
       if (sum >= arr[i] && bool[i-1][sum-arr[i]]){
           curr.add(i);
           recurCombination(arr, i-1, sum-arr[i], curr);
       }
   }

   /* 
    * Print out subsets of arr[] with sum == 0 
    */
   public static void combinationSubsets(int arr[], int z, int sum){
           
       if (z == 0 || sum < 0) {
           return;
       }

       bool = new boolean[z][sum + 1];
       for (int i=0; i<z; ++i){
           bool[i][0] = true;   
       }

       if (arr[0] <= sum) {
           bool[0][arr[0]] = true;
       }

       /* 
        * We fill up every other entry in bool[][] 
        */
       for (int i = 1; i < z; ++i)
           for (int j = 0; j < sum + 1; ++j)
               bool[i][j] = (arr[i] <= j) ? (bool[i-1][j] ||
                       bool[i-1][j-arr[i]])
                       : bool[i - 1][j];
               if (bool[z-1][sum] == false){
                   System.out.println("There are no combinations with" + " sum "+ sum);
                   return;
               }

               /*
                * Traverse bool to find all paths 
                */
               ArrayList<Integer> p = new ArrayList<>();
               recurCombination(arr, z-1, sum, p);
   }
}

/*
 * Chidindu Alim
 */ 
