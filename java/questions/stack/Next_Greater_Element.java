package questions.stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;

public class Next_Greater_Element {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] arr1 = {4,1,2};
		int[] arr2 = {1,3,4,2};
 		int[] ans = next_greate(arr1, arr2);
 		System.out.println(Arrays.toString(ans));
	}
	
	static int[] next_greate(int[] arr1, int[] arr2) {
		
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		HashMap<Integer, Integer> map=new HashMap<>();
		
		for(int num : arr2) {
			
			while(!stack.isEmpty() && num > stack.peek()) { 
//				If current cannot beat top, it can NEVER beat elements below top, Because below elements are even bigger.
//				That’s the whole monotonic decreasing property.				
				
				int poped = stack.pop();
				map.put(poped, num);
				
			}
			stack.push(num); // wait in stack
		}
		while(!stack.isEmpty()) { //last waiting elements which does'nt have next great element
			
			map.put(stack.pop(), -1);
			
		}
		
		int[] ans = new int[arr1.length];
		
		for(int i=0; i<arr1.length; i++) { //just fetch answer for map
			ans[i] = map.get(arr1[i]);
		}
		return ans;
	}

}
