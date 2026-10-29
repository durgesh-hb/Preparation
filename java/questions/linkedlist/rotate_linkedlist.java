package questions.linkedlist;

public class rotate_linkedlist {
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

    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null){
            return head;
        }
        
        ListNode temp = head;
        int length = 1;

        while(temp.next != null){
            length++;
            temp = temp.next;
        }

        k = k % length;

        if(k == 0){
            return head;
        }

        temp.next = head;

        int steptonewtail = length - k - 1;
        ListNode newtail = head;

        for(int i=0; i<steptonewtail; i++){
            newtail = newtail.next;
        }

        ListNode newhead = newtail.next;
        newtail.next = null;

    return newhead;
    }
    
}
