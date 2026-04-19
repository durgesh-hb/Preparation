package questions.arrays.hashing;

import java.util.*;

public class contains_duplicate {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Given an integer array nums, return true if any value appears at least twice, and false if every element is distinct.
//
//				Example 1
//				Input:
//				nums = [1,2,3,1]
//				Output:
//				true
		
		int[] arr = {1, 2, 3, 1};
		boolean ans = containsdup4(arr);
		System.out.println(ans);
	}
	
	
	
	static boolean containsdup2(int[] arr) {
		//o(n square
		boolean dup = false;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					dup = true;
					break;
				}
			}
		}
		return dup;
	}
	
	static boolean containsdup3(int[] arr) {
		// one extra space
		Set<Integer>  seen =new HashSet<Integer>();
		 for(int x : arr) {
			 if(seen.contains(x)) {
				 return true;
			 }
			 
		seen.add(x);
		 }
		 
		 return false;
	}
	
	
	static boolean containsdup4(int[] arr) {
		//best but need to sort the array first
		Arrays.sort(arr);
		
		for(int i= 0; i<arr.length; i++) {
			if(arr[i] == arr[i+1]) {
				return true;
			}
		}
		
		return false;
	}

}
