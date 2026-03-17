package OOPS;

abstract class trafficlight{  //tell what method should be included
	
	abstract void light();   // abstract method is created 
}							// here traffic light class don't know which light is it
						   //logic implements in child class 

class green extends trafficlight{	// method is implemented here like how this method should work
	
	void light() {
		
		System.out.println("you can move it's green light");
	}
	
}

class red extends trafficlight{
	
	void light() {
		System.out.println("stop can't move it's red light");
	}
}


public class abstraction {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		trafficlight a=new green(); // can not create the object of abstract class 
		a.light();
		trafficlight b=new red();
		a.light();
		
	}

}
