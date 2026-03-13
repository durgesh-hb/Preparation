package constructors;

public class Private {
    
    private Private(){
		 
		System.out.println("Thie is private constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // a special type of constructor that can only be accessed from within the same class
		Private s=new Private();
	}
}