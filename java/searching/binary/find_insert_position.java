package searching.binary;

public class find_insert_position {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 3, 4, 5};
		int target = 6;
		System.out.println(search_insert(arr,target));
		
	}
	
	static int search_insert(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			 int mid = start + (end - start ) /2;
			 
			 if(arr[mid] == target ) {
				 return mid;
			 }
			 
			 if(target > arr[mid]) {
				 start = mid + 1;
			 }else {
				 end = mid -1;
			 }
		}
		return start;
	}
    
}
