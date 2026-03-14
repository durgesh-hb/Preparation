package constructors;

public class copycons {
    int roll;
	String name;
	
    // Normal parameterized constructor
	copycons(int roll, String name){
		
		this.roll=roll;
		this.name=name;
	}
	
	//Copy constructor
	copycons(copycons s) {
		
		this.roll=s.roll;
		this.name=s.name;
	}
	
	void display() {
		
		System.out.println(roll + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		copycons s1=new copycons(300, "Ravi kumar");
		copycons s2=new copycons(s1);  // copying object
		
		s1.display();
		s2.display();
	}
}
