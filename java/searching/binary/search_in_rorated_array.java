package searching.binary;

public class search_in_rorated_array {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] arr = {4, 5, 6, 7, 0, 1, 2};
	     int target = 0;

	     int ans = search(arr, target);

	     System.out.println(ans);
		
	}
	
	static int search(int[] arr,int target) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			
			int mid = start +(end - start) / 2;
			
			if(arr[mid] == target) {
				return mid;
			}
			
			//check mid where array is sorted in two half's
			if(arr[start] < arr[mid]) {
				
				// Check if target belongs to the sorted half 
                // left half sorted
				if(target >= arr[start] && target < arr[mid]) {
					end = mid - 1;
				}else {
					start = mid + 1;
				}
			}else {
				
				// Check if target belongs to the sorted half
                // right half sorted
				if(target <= arr[end] && target > arr[mid]) {
					start = mid + 1;
				}else {
					end = mid - 1;
				}
				
			}
			
		}
		return -1;
	}
	
	// Rotated Sorted Array

	// 1. Find mid

	// 2. If target found -> return index

	// 3. Check which half is sorted

	// Left half sorted
	// arr[start] <= arr[mid]

	// Right half sorted
	// arr[start] > arr[mid]

	// 4. Check if target belongs to the sorted half

	// If YES -> search inside that half

	// If NO -> search in the other half

	// 5. Repeat until target found or search space becomes empty

	// 6. If not found -> return -1
	    
}
