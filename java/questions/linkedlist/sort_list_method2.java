package questions.linkedlist;

import java.util.ArrayList;
import java.util.Collections;

public class sort_list_method2 {

    ListNode head;  // head of the list
		
    static class ListNode{
       
       int data;
       ListNode next;
       
       // constructor
       ListNode(int data){
           this.data=data;
           this.next=null;
       }
    }
    public static void main(String[] args) {
        
    }

    public ListNode sortList(ListNode head) {

        if(head == null){
            return head;
        }

        ArrayList<Integer> list = new ArrayList<>();

        ListNode curr = head;

        while(curr != null){
            list.add(curr.data);
            curr = curr.next;
        }

        Collections.sort(list);

        curr = head;
        int index = 0;

        while(curr != null){
            curr.data = list.get(index++);
            curr = curr.next;
        }
        return head;
    }
    
}
