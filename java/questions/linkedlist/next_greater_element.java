package questions.linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class next_greater_element {

    ListNode head;  // head of the list
		
    static class ListNode{
       
       int val;
       ListNode next;
       
       // constructor
       ListNode(int val){
           this.val=val;
           this.next=null;
       }
   }

    public static void main(String[] args) {
        
    }

    public int[] nextLargerNodes(ListNode head) {

        List<Integer> list = new ArrayList<>();
        
        ListNode curr = head;
        while(curr != null){
            list.add(curr.val);
            curr = curr.next;
        }

         int[] result = new int[list.size()];

         Stack<Integer> stack = new Stack<>();// stack store index not values

         for(int i=0; i<list.size(); i++){

            while(!stack.isEmpty() && list.get(stack.peek()) < list.get(i)){

                int index = stack.pop();
                result[index] = list.get(i);

            }

            stack.push(i);
         }

    return result;
        
    }
    
}
