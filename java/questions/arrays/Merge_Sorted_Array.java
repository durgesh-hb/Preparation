package questions.arrays;

import java.util.Arrays;

public class Merge_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1, 3, 5};
		int[] arr2 = {2, 4, 6};
		
		int[] ans = mergesortedarray(arr1, arr2);
		System.out.println(Arrays.toString(ans));
		
	}
	
	static int[] mergesortedarray(int[] arr1, int[] arr2) {
		
		int n = arr1.length;
		int m = arr2.length;
		
		int i=0, j=0, k=0;
		
		int[] newarr = new int[n+m];
		
		while(i<n && j<m) {
			
			if(arr1[i] <= arr2[j]) {
				newarr[k] = arr1[i];
				i++;
			}else {	
				newarr[k] = arr2[j];
				j++;
			}
			k++;
		}
			while(i < n) {
				newarr[k] = arr1[i];
				i++;
				k++;
			}
			
			while(j < m) {
				newarr[k] = arr2[j];
				k++;
				j++;
			}
				
		return newarr;
	}

}
