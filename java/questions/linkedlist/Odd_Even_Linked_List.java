package questions.linkedlist;

public class Odd_Even_Linked_List {

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

    public ListNode oddEvenList(ListNode head) {

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenhead = head.next;
        
        while(even != null && even.next != null){
            
            odd.next = odd.next.next;
            odd = odd.next;

            even.next = even.next.next;
            even = even.next;

        }

        odd.next = evenhead;

        return head;
    }
    
}
