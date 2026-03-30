package collection.list;
import java.util.ArrayList;
public class arraylist {

    public static void main(String[] args) {
        
        ArrayList <Integer> list=new ArrayList<Integer>();
		
		list.add(1); //adding the elements
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);

		list.remove(1); //remove 
		System.out.println(list);

		list.set(1,1233); // set or replace
		System.out.println(list);
        
		int a=list.get(0);//get the specific index 
		System.out.println(a);
    }
    
}
