package Asked;

public class implement_stack_using_array {

	static class stack{
		
		int[] arr;
		int size;
		int top;
		
		stack(int size){ //constructor
			
			this.size=size;
			arr=new int[size];
			top = -1;
			System.out.println("stack initialized");
			
		}
		
		void push(int value) {
			if(top == size -1) {
				System.out.println("stack overflowing");
				return;
			}
			
			top++;
			arr[top] = value;
		}
		
		
		void pop() {
			
			if(top == -1) {
				System.out.println("Stack underflowing");
				return;
			}
			
			int removed = arr[top];
			top--;
			System.out.println("poped value is " + removed);
			
		}
		
		
		void peek() {
			
			if(top == -1) {
				System.out.println("It's empty");
				return;
			}
			
			System.out.println("Top is "+arr[top]);
		}
		
		
		void display() {
			
			if(top == -1) {
				System.out.println("Stack is empty");
				return;
			}
			
			for(int i=top; i>=0; i--) {
				System.out.println(arr[i]);
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stack s=new stack(5);
//		s.push(10);
//		s.push(20);
//		s.push(30);
		
		s.peek();
		s.pop();
		s.display();
	}

}
