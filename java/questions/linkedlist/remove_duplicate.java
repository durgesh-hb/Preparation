package questions.linkedlist;

public class remove_duplicate {
    node head;
	
	public class node{
		
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
			head = newnode;
			return;
		}
		
		node last = head;
		
		while(last.next != null) {
			last=last.next;
		}
		last.next=newnode;
	}
	
	public void display() {
		
		node current=head;
		
		while(current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
		
	}
	
	public void remove() {
		
		node current = head;
		
		while(current != null && current.next != null) {
			if(current.data == current.next.data) {
				// remove the duplicate link and add new distinct next value in next element
				current.next = current.next.next;
			}else {
				current = current.next;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		remove_duplicate list = new remove_duplicate();
		
		list.appeand(10);
		list.appeand(20);
		list.appeand(20);
		list.appeand(30);
		System.out.println("before");
		list.display();
		System.out.println("after");
		list.remove();
		list.display();
		
	}
}
