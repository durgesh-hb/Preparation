package questions.arrays;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class threee_sum {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {-1,0,1,2,-1,-4};
		List<List<Integer>> ans = threesumm(arr);
		System.out.println(ans);
	
	}
	
	static List<List<Integer>> threesumm(int[] arr){
		
		List<List<Integer>> res = new ArrayList<>();
		
		Arrays.sort(arr);  // sort the array
		
		for(int i=0; i<arr.length; i++) {
			
			// Skip duplicate values for i
	        // If current value is same as previous, skip it
	        // because it will give same triplets again
			if(i > 0 && arr[i] == arr[i-1])
				continue;
			
			int l=i+1; //right pointer 
			int r=arr.length-1; //left pointer
			
			while(l<r) {
				
				int sum = arr[i] + arr[l] + arr[r];
				
				if(sum == 0) {
					//found triplet
					res.add(Arrays.asList(arr[i], arr[l], arr[r]));
					l++; //move left
					r--; //move right
					
				    //Skip duplicate values for l
	                // If next value is same as previous, skip it
	                // to avoid duplicate triplets
					while(l < r && arr[l] == arr[l-1]) l++;
					
					// Skip duplicate values for r
	                // If next value is same as previous, skip it
		            while(l < r && arr[r] == arr[r+1]) r--;

				}else if(sum < 0) {		
					l++; // sum is too small → increase it
				}
				else {
					r--; // sum is too big → decrease it
				}
			}
		}
		return res;
	}
    
}
