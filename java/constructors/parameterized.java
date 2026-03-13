package constructors;

public class parameterized {
    
    int roll;
	String name;
	
	// parameterized constructor
	parameterized(int roll, String name){
		
		this.roll=roll;
		this.name=name;
		
	}
	
	void display() {
		
		System.out.println("Hi my name is " + name + " and my roll number is " + roll);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		parameterized s=new parameterized(400,"Ravi");
		s.display();
	}

}
