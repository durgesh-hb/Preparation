package questions.queue;

import java.util.Stack;

public class Implement_Queue_using_Stacks {

        Stack<Integer> input = new Stack<>();
		Stack<Integer> output = new Stack<>();
		
		public void push(int x) {
			input.push(x);
		}
		
		public int pop() {
			
			if(output.isEmpty()) {
				
				while(!input.isEmpty()) {
					output.push(input.pop());
				}
			}
			return output.pop();
		}

		public int peek() {
			
			if(output.isEmpty()) {
				
				while(!input.isEmpty()) {
					output.push(input.pop());
				}
			}
			return output.peek();
		}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Implement_Queue_using_Stacks queue = new Implement_Queue_using_Stacks();
		
		    queue.push(10); 
	        queue.push(20);
	        queue.push(30);

	        System.out.println(queue.pop());   // 10

	        queue.push(40);

	        System.out.println(queue.peek());  // 20

	        System.out.println(queue.pop());   // 20
	        System.out.println(queue.pop());   // 30
	        System.out.println(queue.pop());   // 40
	
	}
}
