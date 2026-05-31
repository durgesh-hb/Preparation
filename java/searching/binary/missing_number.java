package searching.binary;

public class missing_number {
    public static void main(String[] args) {
		// TODO Auto-generated method stub


        int[] nums = {0, 1, 3};

        System.out.println(missingnumber(nums));
		
	}
	
	 static int missingnumber(int[] nums) {

	        int start = 0;
	        int end = nums.length - 1;

	        while (start <= end) {

	            int mid = start + (end - start) / 2;

	            if (nums[mid] == mid) {
	                start = mid + 1;
	            } else {
	                end = mid - 1;
	            }
	        }

	        return start;
	    }
	 // can use the cyclic sort approach if sorted then directly check and return missing number
	 
	 
	//use this for most times (binary search)
	    
	// Missing Number (0 to n)
	// Best Approaches:
	// 1. XOR -> O(n), O(1)
	// 2. Cyclic Sort -> O(n), O(1)
	// 3. binary search (if sorted)

	// Duplicate Number
	// 1. HashMap / HashSet -> O(n), O(n)
	// 2. Nested loops -> O(n²), O(1)
	// 3. Cyclic Sort -> O(n), O(1) (most common interview approach)

	
}
