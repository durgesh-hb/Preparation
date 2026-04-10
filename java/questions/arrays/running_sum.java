package questions.arrays;

import java.util.Arrays;

public class running_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 4};
		int[] ans = runningsum(arr);
		System.out.println(Arrays.toString(ans));
	}
	
	static int[] runningsum(int[] arr) {

		for(int i=1; i<arr.length; i++) {
			arr[i] = arr[i]+arr[i-1];
			//sum of all previous elements including itself.
		}
		
		return arr;
	}

}