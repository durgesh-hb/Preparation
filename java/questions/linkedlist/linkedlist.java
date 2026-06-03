package questions.linkedlist;

public class linkedlist {
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
   
   public static void main(String[] args) {
       // TODO Auto-generated method stub
       
       linkedlist list = new linkedlist();
       
       list.append(10);
       list.append(20);
       list.append(30);
       
       System.out.println("Linked list");
       list.display();
       
   }

    
}
