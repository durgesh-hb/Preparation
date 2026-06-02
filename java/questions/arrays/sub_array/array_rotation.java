package questions.arrays.sub_array;

import java.util.Arrays;

public class array_rotation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 3, 4, 5, 6};
		int k=2;
		rotation(arr, k);
		System.out.println(Arrays.toString(arr));
		
	}
	static  void rotation(int[] arr, int k) {
		
		int n= arr.length;
		int k1=k%n; // only use this if have larger k ex = 8
		
		
		//right rotation
//		reverse(arr, 0, n-1);
//		reverse(arr, 0, k-1);
//		reverse(arr, k, n-1);
		
		//left rotation
		reverse(arr, 0, k-1);
		reverse(arr, k, n-1);
		reverse(arr, 0, n-1);
		
//		Right Rotation =
//
//		Reverse whole array
//		Reverse first k elements
//		Reverse remaining elements
//
//		Left Rotation =
//
//		Reverse first k elements
//		Reverse remaining elements
//		Reverse whole array
	
	}
	
	static void reverse(int[] arr, int l, int r) {
		
		while(l < r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
		
	}
	
}
