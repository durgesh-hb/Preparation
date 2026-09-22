package questions.linkedlist;

public class insert_at_end{

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

    public static void main(String[] args) {
        
    }

    public node insertAtEnd(node head, int x) {
        // code here
        
        node newnode = new node(x);
        
        if(head == null){
            return newnode;
        }
        
        node last = head;
        
        while(last.next != null){
            last = last.next;
        }
        
        last.next = newnode;
        
        return head;
    }

}