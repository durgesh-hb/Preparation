package questions.linkedlist;

public class palindrom_linked_list {
	
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
	 
	public void append(int data) {
		
		node newnode = new node(data);
		
		if(head == null) {
			head = newnode;
			return;
		}
		
		node last = head;
		while(last.next != null) {
			last=last.next;
		}
		last.next=newnode; // same as first.next=second
	}

	public void display() {
		
		node current = head;
		while(current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public boolean palindrome() {
		
		
		//phase 1 find the middle
		node slow = head;
		node fast = head;
		
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
		}
		
		System.out.println(slow.data);
		//phase 2 reverse the half list
		
		node current = slow.next;
		node pre = null;
		
		while(current != null) {
			node next = current.next;
			current.next = pre;
			
			pre = current;
			current = next;
			
		}
		
		//phase 3 compare
		node first = head;
		node second = pre;
		
		while(second != null) {
			if(first.data != second.data) {
				return false;
			}
			
			first = first.next;
			second = second.next;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		palindrom_linked_list list = new palindrom_linked_list();
		
		list.append(1);
		list.append(2);
		list.append(2);
		list.append(1);
//		
		
		System.out.println(list.palindrome());
		
	}

}
