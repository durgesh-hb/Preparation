package OOPS.encapsulation;

public class encap {
	//1. make data members private 
	private String name;
	private int Balance;
	
	//2. use getter and setter method to access the data members
	void setdata(String name,int Balance) {
		
		this.name=name;
		this.Balance=Balance;
	}
	
	void getdata() {
		
		System.out.println("Name " + name);
		System.out.println("Balance " + Balance);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encap n=new encap();
		n.setdata("Nithin", 10000);
		n.setdata("Durgesh", 20000); //old value in the obj is replaced by new value here 
		n.getdata();
		
	}
}