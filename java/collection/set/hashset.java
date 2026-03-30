package collection;
import java.util.*;
public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> s=new HashSet<>();
		
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		System.out.println(s);
		System.out.println(s.contains(2)); //Accessing the Elements
		
		s.remove(1); //remove
		System.out.println(s); 
		
		System.out.println("Printing using Iterating elements");
		
		for(int value : s) {
			System.out.print(value + ",");
		}
		
		// in set you can not update elements 
	}

}
