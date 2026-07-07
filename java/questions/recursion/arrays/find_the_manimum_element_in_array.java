package questions.recursion.arrays;

public class find_the_manimum_element_in_array {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 4, 5, 2, 7};
		System.out.println(minimum(arr, 0, 1000));
		
	}
	
	static int minimum(int[] arr, int index,int min) {
		
		if(arr.length == index) {
			return min;
		}
		
		if(arr[index] < min) {
			min = arr[index];
		}
		
		return minimum(arr, index+1, min);
	}

    static int minimum2(int[] arr, int index) {
		
		if(arr.length-1 == index) {
			return arr[index];
		}
		
		int min = minimum2(arr, index+1);
		
		return Math.min(arr[index], min);
		
	}
}
