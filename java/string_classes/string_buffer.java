package string_classes;

public class string_buffer {
    public static void main(String[] args) {

        StringBuffer s=new StringBuffer();
		
		s.append("nithin bharadwaj");
		System.out.println("String orignal is :"+s);
		
		s.insert(0,"KS ");
		System.out.println("after insert:"+s);
		
		s.replace(3, 4, "NI");
		System.out.println("after the replace :"+s);
		
		s.reverse();
		System.out.println("its a reverse string "+s);
		
		s.delete(0, 1);
		System.out.println("after delete ");
    }
}
