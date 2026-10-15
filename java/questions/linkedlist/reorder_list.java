package questions.linkedlist;

public class reorder_list {

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

   public void reorderList(ListNode head) {

    if(head.next == null){
        return;
    }

    ListNode slow = head;
    ListNode fast = head.next;

    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }

    ListNode second = slow.next;
    slow.next = null;

    ListNode curr = second;
    ListNode prev = null;

    while(curr != null){
        ListNode next = curr.next;

        curr.next = prev;
        prev = curr;
        curr = next;
    }

    ListNode list1 = head;
    ListNode list2 = prev;

    while(list2 != null){

        ListNode firstnext = list1.next;
        ListNode secondnext = list2.next;

        list1.next = list2;
        list2.next = firstnext;

        list1 = firstnext;
        list2 = secondnext;

    }
}

    public static void main(String[] args) {
        
    }
    
}
