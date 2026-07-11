package questions.arrays;

import java.util.Arrays;
import java.util.Stack;

public class next_greater_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 4, 5};
		int[] ans = greater(arr);
		System.out.println(Arrays.toString(ans));

	}
	
	static int[] greater(int[] arr) {
		
		int[] ans = new int[arr.length];
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=arr.length-1; i>=0; i--) {
			
			while(!stack.isEmpty() && stack.peek() < arr[i]) {
				stack.pop();
			}
			
			if(stack.isEmpty()) {
				ans[i] = -1;
			}else {
				ans[i] = stack.peek();
			}
			
			stack.push(arr[i]);
		}
		
		return ans;
	}

}
