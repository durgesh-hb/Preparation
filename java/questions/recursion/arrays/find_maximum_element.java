package questions.recursion.arrays;

public class find_maximum_element {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 4, 5, 2, 7};
		System.out.println(maxi(arr, 0));

	}
	
	static int maximum(int[] arr, int max,int index) {
		
		if(arr.length == index) {
			return max;
		}
		
		if(arr[index] > max) {
			max = arr[index];
		}
		
		return maximum(arr, max , index+1);
	}
	
	static int maxi(int[] arr, int index) { // without carrying max every in every pass
		
		if(arr.length-1 == index) {
			return arr[index];
		}
		
		int maxi = maxi(arr, index+1);
		
		return Math.max(arr[index], maxi);
	}
}
