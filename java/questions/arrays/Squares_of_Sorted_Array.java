package questions.arrays;
import java.util.Arrays;
public class Squares_of_Sorted_Array {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
//
//				Example 1
//				Input:
//				nums = [-4,-1,0,3,10]
//				Output:
//				[0,1,9,16,100]
		
		
		
		int[] arr = {1, 4,2, 4, 3};
		int[] ans = square(arr);
		System.out.println(Arrays.toString(ans));
	}
	
	static int[] square(int[] arr) {
		int temp =0;
		for(int i=0; i<arr.length; i++) {
			
			temp = arr[i] * arr[i];
			arr[i] = temp;
			
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length-i; j++) {
				if(arr[j] < arr[j-1]) {
					int ttemp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = ttemp;
				}
			}
		}
		return arr;
	}
}
