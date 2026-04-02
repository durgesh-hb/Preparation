package collection.queue;
import java.util.*;
public class priority_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> s= new PriorityQueue<Integer>();
		
		s.add(40);
		s.add(10);
		s.add(30);
		s.add(5);
		
		System.out.println(s); // everything is sorted in acse
		s.remove(); // first in first out
		
		System.out.println(s);
		
		System.out.println(s.poll()); //remove heand and return head
		System.out.println(s.peek());
	}

}
