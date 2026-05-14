package questions.stack;
import java.util.ArrayDeque;

public class min_stack {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Design a stack that supports push, pop, top, and retrieving the minimum element — all in O(1) time.
//
//		Example 1
//		Input:
//		push(-2), push(0), push(-3), getMin(), pop(), top(), getMin()
//		Output:b
//		[-3, 0, -2]
		
		Stack st = new Stack();
		st.push(-2);
		st.push(0);
		st.push(-3);		
		
		System.out.println("Min value = " + st.getmin());
		
		st.pop();
		System.out.println("Top is = " + st.top());
		System.out.println("Min value = " + st.getmin());
	}
	
	static class  Stack {
		
		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
		
		ArrayDeque<Integer> minstack = new ArrayDeque<Integer>();
		
		
		public void push(int val) {
			stack.push(val); //Directly push to stack 
			
			//push to minstack only if it is empty or lesser
			if(minstack.isEmpty() || val <= minstack.peek()) {
				minstack.push(val);
			}
		}
		
		public void pop() {
			
			int removed = stack.pop();
			
			if(removed == minstack.peek()) {
				minstack.pop();
			}
		}
		
		public int top() {
			return stack.peek();
		}
		
		public int getmin() {
			return minstack.peek();
		}
		
	}


}