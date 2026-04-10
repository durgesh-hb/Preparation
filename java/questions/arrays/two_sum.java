package questions.arrays;
import java.util.HashMap;
import java.util.Arrays;

public class two_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2, 7, 3, 4};
		int target = 5;
		
		int[] ans = hashmap_app(arr, target);
		System.out.println(Arrays.toString(ans));
	}
	
	//brute force approach
	static int[] two_sum(int[] arr, int target) {
		
		// try every pair
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				int sum = arr[i] + arr[j]; 
				if(sum == target) {
					System.out.print("Found At the index = ");
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};
	}
	
	//only works if array is sorted 
	static int[] better_approch(int[] arr, int target) {
		
		int l = 0;   // left end
		int r = arr.length-1;  //right end
		
		while(l < r) {
			
			int sum = arr[l] + arr[r];
			if(sum == target) {
				System.out.print("Found at the index = ");
				return new int[] {l , r};
			}else if(sum < target) {
				l++;
			}else {
				r--;
			}
			
		}
		return new int[] {-1, -1};
	}
	
	// Hashmap 
	static int[] hashmap_app(int[] arr, int target) {
		
		HashMap<Integer, Integer> m = new HashMap<>(); 
		
		for(int i=0; i<arr.length; i++) {
			
			//find number needed to reach target
			int needed = target - arr[i]; 
			
			if(m.containsKey(needed)) { //check is it there in map
				return new int[] {m.get(needed),i}; // needed means index of that value 
			}
			
			m.put(arr[i], i); //if not then append the value to map
			
		}
		return new int[] {-1,-1};
	}

}
