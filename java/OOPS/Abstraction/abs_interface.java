package OOPS;

interface a{
	
	void show();
}

interface b{
	
	void dipslay();
}

class c implements a{
	
	public void show() {
		
		System.out.println("show");
	}
}

public class abs_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		a aa=new c();
		aa.show();
	}
}
