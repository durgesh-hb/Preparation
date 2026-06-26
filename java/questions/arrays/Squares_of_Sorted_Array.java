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
		
		
		
		int[] arr = {-4, -1, 0, 3, 10};
		square(arr);
		// System.out.println(Arrays.(ans));
	}
	
	static void square(int[] arr) {
		
		int[] ans = new int[arr.length];
		
		int left = 0;
		int right = arr.length-1;
		int p = arr.length-1;
		
		while(left <= right) {
			
			int lsq = arr[left] * arr[left];
			int rsq = arr[right] * arr[right];
			
			if(lsq > rsq) {
				ans[p--] = lsq;
				left++;
			}else {
				ans[p--] = rsq;
				right--;
			}
			
		}
		
		for(int num : ans) {
			System.out.println(num);
		}
	}

	static int[] square2(int[] arr) {
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
