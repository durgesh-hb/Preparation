package questions.recursion.arrays;

public class binary_search {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 4, 8, 11, 17};
		int target = 17;
		int low = 0;
		int high = arr.length-1;
		System.out.println(binary(arr, target, low, high));
		
	}
	
	static int binary(int[] arr, int target, int low, int high) {
		
		if( low > high) {
			return -1;
		}
		
		int mid = low + (high - low) / 2;
		
		if(arr[mid] == target) {
			return mid;
		}
		
		if(target > arr[mid]) {
			low = mid + 1;
		}
		
		if(target < arr[mid]) {
			high = mid -1;
		}
		
		return binary(arr, target, low, high);
	}
}
