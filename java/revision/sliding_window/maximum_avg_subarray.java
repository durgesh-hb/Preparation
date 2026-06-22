package revision.sliding_window;

public class maximum_avg_subarray {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,12,-5,-6,50,3};
		int k = 4;
		System.out.println(maxi_avg(arr,k));
		
	}
	
	static double maxi_avg(int[] arr, int k) {
		
		int window_sum = 0;
		for(int i=0; i<k; i++) {
			window_sum += arr[i];
		}
		
		int max = window_sum;
		for(int i=k; i<arr.length; i++) {
			
			window_sum = window_sum - arr[i-k] + arr[i];
			
			max = Math.max(max, window_sum);
		}
		return (double) max / k;
	}
}
