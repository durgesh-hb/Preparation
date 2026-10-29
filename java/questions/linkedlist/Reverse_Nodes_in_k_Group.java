package questions.linkedlist;

public class Reverse_Nodes_in_k_Group {

    node head;  // head of the list
		
    static class node{
       
       int data;
       node next;
       
       // constructor
       node(int data){
           this.data=data;
           this.next=null;
       }
   }
    public static void main(String[] args) {
        
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        if(head == null || k == 1){
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevgroup = dummy;

        while(true){

            ListNode kth = prevgroup;

            for(int i=0; i<k && kth != null; i++){
                
                kth = kth.next;
            }
                if(kth == null){
                    break;
                }

                
                ListNode nextgroup = kth.next;

                //for reconnect 1 to 4
                ListNode prev = nextgroup;

                ListNode curr = prevgroup.next;

                while(curr != nextgroup){

                    ListNode next = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = next;

                }
                // storing the prev group next ( 1 ) for next group
                ListNode temp = prevgroup.next;

                // connect dummy to kth after reversal
                prevgroup.next = kth;

                // move prevgroup to temp for next group
                prevgroup = temp;
        }
        return dummy.next;
    }
    
}
