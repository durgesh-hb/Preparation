package revision.arrays;
import java.util.HashMap;
import java.util.Arrays;
public class two_sum {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 3, 5, 6};
		int target = 8;
		int[] ans = twosum3(arr, target);
		System.out.println(Arrays.toString(ans));
		
	}
	
	static int[] twosum(int[] arr, int target) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int sum = arr[i] + arr[j];
				if(sum == target) {
					return new int [] {arr[i],arr[j]};
				}
			}
		}
		return new int [] {-1, -1};
		
	}
	
	static int[] twosum2(int[] arr,int target) {
		
		int l = 0;
		int r = arr.length-1;
		
		while(l < r) {
			
			int sum = arr[l] + arr[r];
			if(sum == target) {
				return new int[] {arr[l], arr[r]};
			}else if(sum < target) {
				l++;
			}else {
				r--;
			}
		}
		return new int[] {-1, -1};
	}
	
	static int[] twosum3(int[] arr, int target) {
		
		HashMap<Integer, Integer> store = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			
			
			int needed = target - arr[i];
			
			if(store.containsKey(needed)) {
				return new int[] {store.get(needed),i};
			}
			
			store.put(arr[i], i);
		}
		return new int[] {-1, -1};
	}

}
