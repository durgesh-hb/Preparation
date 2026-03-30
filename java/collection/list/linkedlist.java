package collection.list;
import java.util.LinkedList;
public class linkedlist {
    
    public static void main(String[] args) {
        
        
		LinkedList <String> name=new LinkedList<String>();
		
		name.add("apple"); //adding
		name.add("orange");
		name.add("guava");
		System.out.println(name);
		
		name.set(1, "banana"); //updating
		System.out.println(name);
		
		name.remove(); //remove or pop
		name.remove(); //removes from FIFO
		System.out.println(name);
    }
}
