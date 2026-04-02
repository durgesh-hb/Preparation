package collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class dequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<Integer> s=new ArrayDeque<Integer>();
		
		s.addFirst(1);
		s.add(2);
		System.out.println(s); //and poll ,peek
		
		int q1 = s.removeFirst();
		int q2 = s.removeLast();
		
		System.out.println(q1);
		System.out.println(q2);
	}

}
