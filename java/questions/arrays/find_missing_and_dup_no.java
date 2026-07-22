package questions.arrays;

public class find_missing_and_dup_no {

    public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, 0, 1};
		int ans = missing(arr);
		System.out.println(ans);
		
	}
	 // using the sum formula
	 public int missingNumber(int[] nums) {
        
        int n = nums.length;
        int sum = n *(n + 1) / 2;
        int arrsum = 0;
        for(int i=0; i<n; i++){
            arrsum += nums[i];
        }
   		return sum - arrsum;
	 }
	
	//only 0 to n
	static int missing(int[] arr) {
		
		int xor = arr.length;
		for(int i=0; i<arr.length; i++) {
			
			xor = xor ^ i;
			xor = xor ^ arr[i];
		}
		return xor;
		
	}
//use this for most times

// can also do from binary search
	// int lo = 0, hi = nums.length;
    // while (lo < hi) {
    //     int mid = lo + (hi - lo) / 2;
    //     if (nums[mid] > mid) hi = mid;
    //     else lo = mid + 1;
    // }
    // return lo;
    
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
