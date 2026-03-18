package questions;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class twosum__zerotoend {
	public static void main(String[] args) {
		
		//for two sum
		int[] arrr= {1, 2, 5, 8, 3};
		int target= 13;
		int[] ans=twosum(arrr, target);
		System.out.println(Arrays.toString(ans));
		
	}
	
	static int[] twosum(int arr[], int target) {
		
		if(arr.length<2) {
			System.out.println("Array should contain atleast two elements");
			return new int[] {};
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++){
				if(arr[i] + arr[j]==target) {
					return new int[] { arr[i],arr[j] };
				}
			}
		}
		
		return new int[] {};	
	}
	
}