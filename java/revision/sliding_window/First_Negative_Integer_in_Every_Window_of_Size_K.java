package revision.sliding_window;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class First_Negative_Integer_in_Every_Window_of_Size_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {12, -1, -7, 8, -15};
		int k = 3;
		negative_number(arr,k);
		
	}
	
	static void negative_number(int[] arr, int k) {
		
		Queue<Integer> queue= new LinkedList<>();
		
		List<Integer> ans= new ArrayList<>();
		
		int start = 0;
		
		for(int end=0; end<arr.length; end++) {
			
			//store only negative number
			if(arr[end] < 0) {
				queue.add(arr[end]);
			}
			//arr = [12, -1, -7, 8, -15]
			if(end - start + 1 == k) {
				
				if(queue.isEmpty()) {
					ans.add(0);
				}
				else {
					ans.add(queue.peek());
				}	
				
				if(!queue.isEmpty() && arr[start] == queue.peek()) {
					queue.poll();
				}
				
				start++;
			}
				
		}
		System.out.println(ans);
		
	}

}
