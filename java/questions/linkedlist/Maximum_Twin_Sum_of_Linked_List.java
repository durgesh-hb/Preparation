package questions.linkedlist;

public class Maximum_Twin_Sum_of_Linked_List {

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

    public int pairSum(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode curr = slow;
        ListNode prev = null;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        // if(fast == null){
        //     slow = slow.next;
        // }

        ListNode first = head;
        ListNode second = prev;

        int max = 0;
        while(second != null){

            int sum = first.data + second.data;
            max = Math.max(max, sum);

            first = first.next;
            second = second.next;
        }

        return max;
    }
    
}
