package thread;

class game implements Runnable{

	private String name;
	
	game(String name){
		this.name=name;
		
	}
	@Override 
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}

public class runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating the seprt thread
		Thread g1= new Thread(new game("BGMI"));
		Thread g2= new Thread(new game("COD"));
		
		g1.start();
		g2.start();
		
		
	}

}
