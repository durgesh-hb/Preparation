package questions.arrays.hashing;

public class Productof_Array_Except_Self {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4};
		 product(arr);
		 
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

}
