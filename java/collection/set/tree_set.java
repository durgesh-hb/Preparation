package collection.set;
import java.util.TreeSet;
public class tree_set {
    
    public static void main(String[] args){
    TreeSet<String> s=new TreeSet<String>();
		
		
    s.add("nithin");
    s.add("esha");
    s.add("durgesh");
    s.add("adithya");
    System.out.println(s); // store in the ordered 
    
    s.remove("durgesh"); // can't leave the blank have to give the value to remove
    
    System.out.println(s);
    
    System.out.println("accessing the elements = " + s.contains("adithya"));
    
    //Iterating
    for(String value : s) {
        System.out.println(value);
    }
}
}
