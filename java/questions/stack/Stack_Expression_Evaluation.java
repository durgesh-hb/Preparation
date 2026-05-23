package questions.stack;
import java.util.ArrayDeque;
public class Stack_Expression_Evaluation {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Evaluate an expression in Reverse Polish Notation. Valid operators are +, -, *, and /. Each operand may be an integer or another expression. Division between two integers always truncates toward zero.
//
//		Example 1
//		Input:
//		tokens = ["2","1","+","3","*"]
//		Output:
//		9
//		Explanation:
//		((2 + 1) * 3) = 9
		
		String[] arr = {"2", "1", "+", "3", "*"};
		int result = expression_evaluation(arr);
		System.out.println(result);
		

	}
	
	static int expression_evaluation(String[] arr) {
		
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i].equals("+") || arr[i].equals("-") ||
			   arr[i].equals("*") || arr[i].equals("/")){
				
				int a = stack.pop();
				int b = stack.pop();
				
				int result = 0;
				
				if(arr[i].equals("+")) result = b + a;
				else if(arr[i].equals("-")) result = b - a;
				else if(arr[i].equals("*")) result = b * a;
				else if(arr[i].equals("/")) result = b / a;
				
				stack.push(result);
				
			}else {
				stack.push(Integer.parseInt(arr[i]));
			}
			
		}
		return stack.pop();
	}

}
