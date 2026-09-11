package questions.arrays.hashing;

import java.util.Arrays;

public class Productof_Array_Except_Self {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4};
		//product(arr);

		 System.out.println(Arrays.toString(prod(arr)));


		 
	}

	static int[] prod(int[] arr){

		int n = arr.length;
		int[] result = new int[n];

		// calculate left or prefix product 
		int leftproduct = 1;
		for(int i=0; i<n; i++){
			result[i] = leftproduct;
			leftproduct *= arr[i];
		}
		// calculate right or suffix product
		int rightproduct = 1;
		for(int i=n-1; i>=0; i--){
			result[i] *= rightproduct;
			rightproduct *= arr[i];
		}

		return result;
	}

	static void product(int[] arr) {
		int n= arr.length;
		int[] leftproduct = new int[n];
		int[] rightproduct= new int[n];
		
		int temp = 1;
		for(int i=0; i<n; i++) {
			leftproduct[i] = temp;
			temp *= arr[i];
		}
		int temp2 = 1;
		for(int j=n-1; j>=0; j--) {
			rightproduct[j] = temp2;
			temp2 *=arr[j];
		}
		
//		Left Product[] = [1, 1, 2, 6]
//		Right Product[] = [24, 12, 4, 1]
//		Result[] = [24, 12, 8, 6]
//						
						
		int[] newarr = new int[n];
		
		for(int i= 0; i<n; i++) {
			newarr[i] = leftproduct[i] * rightproduct[i];
		}
		
		
		for(int nums : newarr) {
			System.out.print(nums + " ");
		}
	}

	// brute force
	public static int[] product2(int[] arr){

		int[] result = new int[arr.length];

		for(int left = 0; left <arr.length; left++){
			int prod = 1;
			for(int right = 0; right < arr.length; right++){
				if(left == right){
					continue;
				}
				prod *= arr[right];
			}
			result[left] = prod;
		}
		return result;
	}

}
