package questions.linkedlist;
public class add_two_number {

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
    
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        int sum = 0;
        int carry = 0;

        while(list1 != null || list2 != null || carry != 0){

            sum = carry;

            if(list1 != null){
                sum += list1.val;
                list1 = list1.next;
            }

            if(list2 != null){
                sum += list2.val;
                list2 = list2.next;
            }

            carry = sum / 10; // give's remainder
           
           curr.next = new ListNode(sum%10);
           curr = curr.next;

        }

        return dummy.next;
        
    }

}
