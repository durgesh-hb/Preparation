package questions.linkedlist;

public class linked_list_cycle_II {

    ListNode head;
	
	static class ListNode {
		int data;
		ListNode next;
		
		ListNode(int data){
			this.data=data;
			this.next=null;
		}
	}

    public static void main(String[] args) {
        
    }

    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        // Phase 1: Detect cycle normal as cycle detection
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // we alreday know there is a cycle so don't do fast != null fast.next != null
                // Phase 2: Find cycle start
                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }
        }

        // No cycle
        return null;
    }
    
}
