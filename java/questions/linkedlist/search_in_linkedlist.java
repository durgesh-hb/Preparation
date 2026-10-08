package questions.linkedlist;

public class search_in_linkedlist {

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

    public boolean searchKey(node head, int key) {
        
        // normal through traversal
        node start = head;
        while(start != null){
            if(start.data == key){
                return true;
            }
            start = start.next;
        }
        return false;
        

        // with recursion
        if(head == null){
            return false;
        }
        
        if(head.data == key){
            return true;
        }
        
        return searchKey(head.next , key);
    }
    
}
