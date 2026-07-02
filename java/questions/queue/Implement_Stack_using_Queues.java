package questions.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Implement_Stack_using_Queues {

    Queue<Integer> stack = new ArrayDeque<>();
	
	public void push(int x) {
		
		stack.offer(x);
		
		for(int i=0; i<stack.size()-1; i++) {
			stack.offer(stack.poll());
		}
		
	}
	
	public int pop() {
		
		return stack.poll();
		
	}
	
	public int peek() {
		
		return stack.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Implement_Stack_using_Queues myStack = new Implement_Stack_using_Queues();
		
		System.out.println("Pushing: 10, 20, 30");
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		
		System.out.println("Top element (peek): " + myStack.peek()); // Expected: 30
		
		System.out.println("Popped element: " + myStack.pop()); // Expected: 30
		System.out.println("Popped element: " + myStack.pop()); // Expected: 20
		
		System.out.println("Pushing: 40");
		myStack.push(40);
		
		System.out.println("Top element (peek): " + myStack.peek()); // Expected: 40
		System.out.println("Popped element: " + myStack.pop()); // Expected: 40
		System.out.println("Popped element: " + myStack.pop()); // Expected: 10
				
	}
  
}