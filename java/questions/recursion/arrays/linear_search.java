package questions.recursion.arrays;

public class linear_search {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 6, 3, 6, 2};
		System.out.println(linear_search(arr, 7, 0));
	}
	
	static boolean linear_search(int[] arr, int target, int index) {
		//base condition
		if(index == arr.length-1) {
			return false;
		}
		
		// work
		if(arr[index] == target) {
			return true;
		}
		
		// recursive call
		return linear_search(arr, target, index+1);
	}
}
