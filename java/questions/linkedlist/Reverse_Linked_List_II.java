package questions.linkedlist;

public class Reverse_Linked_List_II {

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

    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy = new ListNode(0);

        dummy.next = head;

        ListNode before = dummy;

        for(int i=1; i<left; i++){
            before = before.next;
        }

        ListNode curr = before.next;

        for(int i=0; i<right - left; i++){
			
            ListNode next = curr.next; // save the current node 
            curr.next = next.next;    
            next.next = before.next;   
            before.next = next;        
        }
         return dummy.next;
    }
    
}
