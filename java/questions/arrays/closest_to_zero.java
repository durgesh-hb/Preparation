package questions.arrays;

import java.util.Arrays;

public class closest_to_zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {-2, -1};
		int ans = closestzero(arr);
		System.out.println(ans);		
	}

	static int closestzero(int[] arr) {
		
		int min = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(Math.abs(arr[i]) < Math.abs(min)) {
				
				min = arr[i];
				//tie case , picking the positive number
			}else if(Math.abs(arr[i]) == Math.abs(min) && arr[i] > min) {
				min = arr[i];
			}
			
		}
		return min;
	}
	
}
