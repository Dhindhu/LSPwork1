package org.howard.edu.lsp.exam.question41;

import java.util.ArrayList;

/**
 * Method which eliminates all occurrences 
 * of 0 from passed list
 * @author chidindu
 *
 */
public class RemoveZeros {
	public static void removeZeroes(ArrayList<Integer> List){		
		for(int i = 0; i < List.size(); i++){	
			if(List.get(i) == 0){
				List.remove(i);
				i--;
			}
		}
	}
}
