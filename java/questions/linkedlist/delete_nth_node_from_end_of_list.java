package questions.linkedlist;

public class delete_nth_node_from_end_of_list {
	
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
	
	public void delete(int target) {
		
		node dummy = new node(0);
		dummy.next = head;
		
		node slow = dummy;
		node fast = dummy;
		
		for(int i=0; i<=target; i++) {
			fast = fast.next;
		}
		
		while(fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		
		slow.next=slow.next.next;
		head=dummy.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		delete_nth_node_from_end_of_list list = new delete_nth_node_from_end_of_list();
		
		list.append(10);
		list.append(20);
		list.append(30);
		list.append(40);
		
		System.out.println("Linked list");
		list.display();
		
		list.delete(4);
		
		System.out.println("After");
		list.display();
		
//		Linked list
//		10 -> 20 -> 30 -> 40 -> null
//		After
//		10 -> 30 -> 40 -> null

		
	}

}
