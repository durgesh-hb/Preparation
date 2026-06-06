package questions.linkedlist;

public class linked_list_cycle {

	node head;
	
	static class node{
		
		int data;
		node next;
		
		node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public void appeand(int data) {
		
		node newnode = new node(data);
		
		
		if(head == null) {
			head=newnode;
			return;
		}
		
		node last = head;
		while( last.next != null) {
			last=last.next;
		}
		last.next=newnode;
	}
	
	public void display() {
		
		node current = head;
		
		while(current != null) {
			System.out.print(current.data + " -> ");
			current=current.next;
		}
		System.out.println("null");
	}
	
	public void cycle() {
		
		node slow=head;
		node fast=head;
		
		while(fast != null && fast.next != null) {
			
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow==fast) {
				System.out.println("Cycle found at = " + fast.data + " to " + slow.data);
				return;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		linked_list_cycle list=new linked_list_cycle();
		
		list.appeand(10);
		list.appeand(20);
		list.appeand(30);
		
		list.display();
		
		list.cycle();
		
		
	}

}
