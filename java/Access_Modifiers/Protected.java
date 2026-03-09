package Access_Modifiers;


class Vehicle {

    protected int speed = 100;

}

class Bike extends Vehicle {

    void show(){
        System.out.println(speed);
    }

}
public class Protected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Bike b = new Bike();
		       
		        b.speed+=10;
		        b.show();
	
	}

}