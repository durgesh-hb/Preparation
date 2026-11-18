package questions.stack.monotonic_stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Asteroid_Collision {

    public static void main(String[] args) {
        
    }

    // brute  froce
    public int[] asteroidCollision1(int[] asteroids) {

        List<Integer> list = new ArrayList<>();
        for(int num : asteroids) list.add(num);

        int i = 0;

        while(i < list.size()-1){
            int a = list.get(i);
            int b = list.get(i+1);

            if(a > 0 && b < 0){
                if(Math.abs(a) > Math.abs(b)){
                    list.remove(i+1);
                }else if(Math.abs(a) < Math.abs(b)){
                    list.remove(i);
                    if(i > 0) i--;
                }else{
                    list.remove(i+1);
                    list.remove(i);
                    if(i > 0) i--;
                }
            }else{
                i++;
            }

        }
  
        int[] ans = new int[list.size()];
        for(int j=0; j<list.size(); j++){
            ans[j] = list.get(j);
        }
        return ans;
    }

    // optimal
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for(int a : asteroids){
            while(!stack.isEmpty() && a < 0 && stack.peek() > 0 && stack.peek() < -a){
                stack.pop();
            }

            if(!stack.isEmpty() && a < 0 && stack.peek() > 0){
                if(stack.peek() == -a){
                    stack.pop();
                }
            }else{
                stack.push(a);
            }
        }
        int[] ans = new int[stack.size()];
        for(int i=stack.size()-1; i>=0; i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
    
}
