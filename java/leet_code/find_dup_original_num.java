package leet_code;
import java.util.Arrays;

public class find_dup_original_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Find the number that occurs twice and the number that is missing and return them in the form of an array.
//
//		Input: nums = [1,2,2,4]
//		Output: [2,3]
		
		int[] arr = {1,1};
		int[] ans = cyclic(arr);
		System.out.println(Arrays.toString(ans));
		
	}
	
	static int[] dup(int[] arr){
		
		int n = arr.length;
		int[] count = new int[n+1];
		
		for(int num : arr) {
			count[num]++;
		}
		
		int duplicate = 0;
		int missing = 0;
		
		for(int i= 1; i<=n; i++) {
			
			if(count[i] == 2) {
				duplicate = i;
			}
			
			if(count[i] == 0) {
				missing = i;
			}
			
		}
		return new int [] {duplicate, missing};
	}

	static int[] cyclic(int[] arr) {
		
		int i = 0;
		while(i<arr.length) {
			int correct_index=arr[i]-1;
			
			if(arr[i] != arr[correct_index]) {
				swap(arr, i, correct_index);
			}else {
				i++;
			}
		}
		
		for(int j=0; j<arr.length; j++) {
			if(arr[j] != j+1) {
				return new int [] {arr[j], j+1};
			}
		}
		return new int [] {-1, -1};
	}
	
	static void swap(int[] arr, int a, int b) {
		
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}
	
}
