package revision.sliding_window;

public class maximum_subarray_sum {

    public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,3,1,2,4,3};
		int target = 7;
		System.out.println(maxi(arr,target));
		
	}
	
	static int maxi(int[] arr, int target) {
		
		int start = 0;
		int sum = 0;
		int min_length = Integer.MAX_VALUE;
		
		for(int end = 0; end <arr.length; end++) {
			
			sum += arr[end];
			
			while(sum >= target) {
				
				min_length = Math.min(min_length, end - start + 1);
				
				sum -=arr[start];
				start++;
				
			}
			
		}
		return min_length;
	}
}