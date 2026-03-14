package string_classes;

public class string_builder {
    
    public static void main(String[] args) {

        StringBuilder s=new StringBuilder();
		
		s.append("Java Programming ");
		System.out.println(s);
		
		s.insert(4,"is ");
		System.out.println("after insert"+s);
	  
		s.replace(5,6,"PR");
		System.out.println("after replace"+s);
		
		s.reverse();
		System.out.println("aft6er reverse ");
		
        System.out.println("Capacity: " + s.capacity());
        System.out.println("Length: " + s.length());
        
        char c = s.charAt(5);
        System.out.println("character at "+c);
        
        s.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + s);
    }
}
