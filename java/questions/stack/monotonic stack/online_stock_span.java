package stack.monotonic

import java.util.ArrayList;
import java.util.Stack;

public class online_stock_span {

    public static void main(String[] args) {
        
    }

    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        
        ArrayList<Integer> span = new ArrayList<>();
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
                stack.pop();
            }
            
            if(stack.isEmpty()){
                span.add(i+1);
            }else{
                span.add(i-stack.peek());
            }
            stack.push(i);
        }
        return span;
    }
    
}
