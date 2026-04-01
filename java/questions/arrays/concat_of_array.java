package questions.arrays;
import java.util.TreeSet;
public class concat_of_array {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> s=new TreeSet<String>();
		
		
		s.add("nithin");
		s.add("esha");
		s.add("durgesh");
		s.add("adithya");
		System.out.println(s); // store in the ordered 
		
		s.remove("durgesh"); // can't leave the black have to give the value to remove
		
		System.out.println(s);
		
		System.out.println("accessing the elements = " + s.contains("adithya"));
		
		//Iterating
		for(String value : s) {
			System.out.println(value);
		}
	}
}
