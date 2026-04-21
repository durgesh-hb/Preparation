package questions.arrays.sub_array;

public class majority_element {

    public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Given an array nums of size n, return the majority element — the element that appears more than ⌊n/2⌋ times. The majority element always exists.
//
//				Example 1
//				Input:
//				nums = [3,2,3]
//				Output:
//				3
		
		int[] arr = {2, 2, 1, 1, 1, 2, 2};
		int ans = majorityelement(arr);
		System.out.println(ans);
	}
	
	static int majorityelement(int[] arr) {
		
		int cand = 0;
		int count =0;
		for(int i=0; i<arr.length; i++) {
				
			if(count == 0) {
				cand = arr[i];
			}	
			
			if(arr[i] == cand ) {
				count++;
			}else {
				count--;
			}
	}
		return cand;
}
    
}
