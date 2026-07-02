package questions.queue;
import java.util.Queue;
import java.util.ArrayDeque;
public class number_of_recent_call {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		number_of_recent_call rc = new number_of_recent_call();

	      System.out.println(rc.ping(1));
	      System.out.println(rc.ping(100));
	      System.out.println(rc.ping(3001));
	      System.out.println(rc.ping(3002));
		
	}
	
	  Queue<Integer> queue = new ArrayDeque<>();

	    public int ping(int t) {

	        // Add current request time
	        queue.offer(t);

	        // Remove all requests older than (t - 3000)
	        while (queue.peek() < t - 3000) {
	            queue.poll();
	        }

	        // Remaining requests are within the last 3000 ms
	        return queue.size();
	    }
}
