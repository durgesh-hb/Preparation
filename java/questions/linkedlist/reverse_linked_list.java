package questions.linkedlist;

public class reverse_linked_list {
	node head;
	
	public class node {
		
		int data;
		node next;
		
		node(int data){
			this.data=data;
			this.next=null;
		}
		
	}

	public void append(int data) {
		node newnode = new node(data);
		
		if(head == null) {
			head=newnode;
			return;
		}
		
		node last = head;
		while(last.next != null) {
			last=last.next;
		}
		last.next=newnode;
	}
	
	public void display() {
		
		node current = head;
		while(current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
		
	}
	
	public void reverse() {
		
		node prev = null;
		node curr = head;
		node next = null;
		
		while(curr != null) {
			
			// Save next node
			next = curr.next;
			//reverse the link
			curr.next = prev;
			
			//move pre and curr forward
			prev = curr;
			curr = next;
			
		}
		//new head
		head = prev;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverse_linked_list list=new reverse_linked_list();
		
		list.append(10);
		list.append(20);
		list.append(30);
		System.out.println("Before");
		
		list.display();
		
		list.reverse();
		
		list.display();
		
	}
}
