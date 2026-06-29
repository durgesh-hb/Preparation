package questions.arrays.sub_array;

public class Maximum_Sum_of_Size_K {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,5,1,3,2};
		int k=3;
		System.out.println(maxi(arr,k));
	}
	
	static int maxi(int[] arr,int k) {
	
		int windowsum = 0;
		
		for(int i=0; i<k; i++) {
			windowsum +=arr[i];
		}
		
		int max = windowsum;
		for(int i=k; i<arr.length; i++) {
			windowsum = windowsum - arr[i-k] + arr[i];
			max = Math.max(max, windowsum);
		}
		return max;
	}

}
