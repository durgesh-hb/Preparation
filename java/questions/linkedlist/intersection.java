package questions.linkedlist;

import java.util.HashSet;

public class intersection {
	
	node head;
	
	static class node {
		int data;
		node next;
		
		node(int data){
			this.data=data;
			this.next=null;
		}
	}

	// methode 1
	public void intersection(node headA, node headB) {
		
		HashSet<node> set= new HashSet<>();
		
		node temp=headA;
		// Store all nodes of first list
		while(temp != null) {
			set.add(temp);
			temp=temp.next;
		}
		
		temp = headB;
        // Check nodes of second list
		while(temp != null) {
			if(set.contains(temp)) { //found
				System.out.println("Intersection found");
				return;
			}
			temp=temp.next;
		
		}
	}

	// methode 2
	    public node getIntersectionNode(node headA, node headB) {

			node currentA = headA;
			node currentB = headB;

        while(currentA != currentB){

            if(currentA != null){
                currentA = currentA.next;
            }else{
                currentA = headB;
            }

            if(currentB != null){
                currentB = currentB.next;
            }else{
                currentB = headA;
            }

        }
        return currentA;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
