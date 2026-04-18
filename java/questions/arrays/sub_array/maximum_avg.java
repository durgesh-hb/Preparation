package questions.arrays.sub_array;

public class maximum_avg {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 1, 3, 3};
		int k =3;
//		double ans = maxavg(arr,k);
//		System.out.println(ans);
		
		demo(arr,k);
		
		double ans = mixiavg(arr, k);
		System.out.println(ans);
	}
	
	static void demo(int[] arr, int k) {
		int sum = 0;
		
		for(int i=0; i<k; i++) { // first window
			sum +=arr[i];
		}
		
		int maxsum = sum;
		System.out.println(sum);
		
		for(int i=k; i<arr.length; i++) { //i=k because we need the next adding element
			sum = sum - arr[i-k] + arr[i]; // previous are already used
			
			if(sum > maxsum) {
				maxsum = sum;
			}
			System.out.println(maxsum);
		}
	}
	
	
	
	static double mixiavg(int[] arr, int k) {
		
		int sum = 0;
		for(int i=0; i<k; i++) {
				sum += arr[i];
		}
		double max = sum;

		
		for(int i=k; i<arr.length; i++) {
			
			sum = sum - arr[i-k] + arr[i];
			
			if(sum > max) {
				max=sum;
			}
			
		}
		
		return max / k;
	}
}
