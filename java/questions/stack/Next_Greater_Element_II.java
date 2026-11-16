package questions.stack;

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element_II {

    int[] arr = {1,2,1};
    
    public static void main(String[] args) {
        
    }

    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] arr = new int[n];
        Arrays.fill(arr, -1);

        Stack<Integer> stack = new Stack<>();

        for(int i=2*n-1; i>=0; i--){
            int num = nums[i%n];
            while(!stack.isEmpty() && stack.peek() <= num){
                stack.pop();
            }

            if(i < n && !stack.isEmpty()){
                arr[i] = stack.peek();
            }
            stack.push(num);
        }
        return arr;
    }
}
