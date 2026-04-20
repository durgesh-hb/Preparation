package questions.arrays.hashing;

public class first_missing_positive_no {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Given an unsorted integer array nums, return the smallest missing positive integer. You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
//
//				Example 1
//				Input:
//				nums = [3,4,-1,1]
//				Output:
//				2
//				Explanation:
//				1 is present, 2 is the first missing positive.
		
		int[] arr = {1 , 3, 2, 5, 4, 6};
		int ans = cyclic_sort(arr);
		System.out.println(ans);
		
	}
	
	static int cyclic_sort(int[] arr) {
		
		int i = 0;
		while(i < arr.length) {
			
			int correctindex = arr[i]-1;
			if(arr[i] <= arr.length && arr[i] != arr[correctindex]) {
				int temp = arr[i];
				arr[i] = arr[correctindex];
				arr[correctindex] = temp;
			}else {
				i++;
			}
			
		}
		
		for(int index = 0; index<arr.length ; index++) {
			if(arr[index] != index + 1) {
				return index + 1;
			}
		}
		return arr.length + 1;
	}
}
