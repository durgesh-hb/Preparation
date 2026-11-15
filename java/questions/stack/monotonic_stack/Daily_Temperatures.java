package questions.stack;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Daily_Temperatures {

    public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] temperatures = {73,74,75,71,69,72,76,73};
		int[] ans = temperature(temperatures);
		System.out.println(Arrays.toString(ans));
	}
	
	static int[] temperature(int[] temps) {
		
		int[] ans = new int[temps.length];
		
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		//same as monotonic decreasing stack
		for(int i=0; i<temps.length; i++) {
			
			while(!stack.isEmpty() && temps[i] > temps[stack.peek()]){
				
				int previndex = stack.pop();
				
				ans[previndex] = i - previndex;
				
			}
			stack.push(i);
			
		}
		return ans;
	}
    
}
