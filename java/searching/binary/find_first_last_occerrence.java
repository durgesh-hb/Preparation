package searching.binary;

public class find_first_last_occerrence {
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5,7,7,8,8,10};
		int target = 7;
		int first = first_last(arr,target, true);
		int second = first_last(arr, target, false);
		
		System.out.println("First occerence is = " + first);
		System.out.println("Second occerence is = " + second);
	}
	
	static int first_last(int[] arr, int target, boolean first) {
		
		int start = 0;
		int end = arr.length-1;
		int ans = 0;
		
		while(start <= end) {
			
			int mid = start + (end - start) / 2;
			
			if(target < arr[mid]) {
				end = mid - 1;
			}else if(target > arr[mid]) {
				start = mid + 1;
			}else {
				
				ans = mid;
				
				if(first) {
					end = mid - 1;
				}else {
					start = mid + 1;
				}
				
			}
			
		}
		return ans;
	}
	
}
