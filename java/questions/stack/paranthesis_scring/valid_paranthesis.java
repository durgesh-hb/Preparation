package questions.stack.paranthesis_scring;

import java.util.HashMap;
import java.util.Stack;

public class valid_paranthesis {

    public static void main(String[] args) {
        
    }
    
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){ // closing
                if(stack.isEmpty() || stack.pop() != map.get(ch)){
                    return false;
                }
            }else{ // opening
                stack.push(ch);
            }
        } 
        return stack.isEmpty();
    }

}
