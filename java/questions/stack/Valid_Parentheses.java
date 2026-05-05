package questions.stack;

import java.util.ArrayDeque;

public class Valid_Parentheses {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Given a string s containing just the characters '(', ')', '[', ']', '{' and '}', determine if the input string is valid. An input string is valid if every open bracket is closed by the same type of bracket and in the correct order.
//
//		Example 1
//		Input: s = "()"
//		Output: true
		
//		Example 2
//		Input: s = "()[]{}"
//		Output: true

		
		String brackets = "({"; 
		boolean ans = correct_parentheses(brackets);
		System.out.println(ans);
		
	}
	
	static boolean correct_parentheses(String s) {
		
		ArrayDeque <Character> stack = new ArrayDeque<>();
		
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' ) {
				stack.push(s.charAt(i));
			}else {
				
				if(stack.isEmpty())
					return false;
				char top = stack.pop();
				if(s.charAt(i) == ')' && top != '(')
					return false;
				if(s.charAt(i) == '}' && top != '{')
					return false;
				if(s.charAt(i) == ']' && top != '[')
					return false;
			}
			
		}
		return stack.isEmpty();		
	}
    
}
