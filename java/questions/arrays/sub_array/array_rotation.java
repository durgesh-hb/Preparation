package questions.arrays.sub_array;

import java.util.Arrays;

public class array_rotation {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 4, 5, 6};
		rotate(arr, 3);
		System.out.println(Arrays.toString(arr));
	}
	
	static void rotate(int[] arr, int k) {
		
		int n=arr.length;
		int k1=k%n;
		
		reverse(arr, 0, n-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, n-1);
		
	//  left rorate
//		reverse(arr, 0, k-1);
//		reverse(arr, k, n-1);
//		reverse(arr, 0, n-1);
		
//		👉 Right rotate:
//
//			FULL → LEFT PART → RIGHT PART
//
//		👉 Left rotate:
//
//			LEFT PART → RIGHT PART → FULL
		
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
