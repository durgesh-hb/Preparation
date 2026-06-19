package revision.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class tree_sum {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {-1,0,1,2,-1,-4};
		List<List<Integer>> ans = threesum(arr);
		System.out.println(ans);
	
	}
	
	static List<List<Integer>> threesum(int[] arr){
		
		List<List<Integer>> res = new ArrayList<>();
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			
			if(i > 0 && arr[i] == arr[i-1]) {
				continue;
			}
			
			int l = i+1;
			int r = arr.length-1;
			
			while(l<r) {
				
				int sum = arr[i] + arr[l] + arr[r];
				
				if(sum == 0) {
					
					res.add(Arrays.asList(arr[i] , arr[l], arr[r]));
					l++;
					r--;
					
					while(l<r && arr[l] == arr[l-1]) l++;
					
					while(l<r && arr[r] == arr[r-1]) r--;
				}
				else if(sum < 0) {
					l++;
				}else {
					r--;
				}
				
			}
			
		}
		return res;
	}
    
}
