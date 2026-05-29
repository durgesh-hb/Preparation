package questions.arrays;

public class find_missing_no {

    public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, 0, 1};
		int ans = missing(arr);
		System.out.println(ans);
		
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
    
	// can use for duplicate
//	1) hashmap 
//	2) two for loops 
//	3) cyclic sort and check thorgh for loop
	
	
	
//	Missing Number → XOR or Cyclic Sort
//	Duplicate Number → Cyclic Sort is usually the easiest and most common

}
