package stream;
import java.util.*;
import java.util.stream.Collectors;
public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for(int i=0; i<20; i++) {
			num.add(i);
		}
		
		System.out.println(num);
		
		// intermediate operations
		//	filter() -> filters the value 
		//	map() -> to modify the data
		//	sorted() -> to sort the value is asc
		//	distinct() -> to get unique value
		//	limit()
		
		System.out.println("Stream intermediate operations");
		
		num.stream()
			.filter(x -> x % 2 == 0)
			.map(x -> x*2)
			.forEach(x ->System.out.println(x));
		
		
//		Terminal Operations
//		forEach()
//		collect() -> collects the filter's data store
//		count() -> counts the value
//		reduce() -> 
		
		System.out.println("terminal operations");
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		List<Integer> newlist = list.stream()
									.filter(x -> x >2)
									.collect(Collectors.toList());
									
		
		System.out.println(newlist);
		
		
		//reduce
		List<Integer> llist = Arrays.asList(1,2,3,4,5);

		int sum = llist.stream()
		              .reduce(0, (a,b) -> a + b);

		System.out.println(sum);
		
	}

}
