package collection.set;
import java.util.*;
public class linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet <String> sh=new LinkedHashSet<>();
		
		sh.add("ravi");
		sh.add("kumar");
		sh.add("sunil");
		sh.add("raju");
		
		System.out.println(sh);
		
		sh.remove("kumar");
		
		for(String value: sh) {
			System.out.print(value + ",");
		}
		
		//same as set can't updated and access index 
		
	}

}
