package revision.others;

public class move_zero_end {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 0, 2, 0, 3, 0, 6};
		zero_to_end(arr);
		
	}
	
	static void zero_to_end(int[] arr) {
		
		int j=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		
		for(int num : arr) {
			System.out.println(num);
		}
	}
}
