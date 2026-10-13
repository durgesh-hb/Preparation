package questions.linkedlist;

public class sort_list_method1 {
    public static void main(String[] args) {
        
    }

    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode slow = head;
        ListNode fast = slow.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Save the start of the second half of the list.
        ListNode second = slow.next;
        //cut the link between the first half and the second half.
        slow.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(second);

       return mergeTwoLists(left , right);

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

       ListNode dummy = new ListNode(0);

       ListNode tail = dummy;

       while(list1 != null && list2 != null){

            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next; 
            }else{
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
       }

       if(list1 != null){
            tail.next = list1;
       }else{
            tail.next = list2;
       }
        return dummy.next;
    }
    
}
