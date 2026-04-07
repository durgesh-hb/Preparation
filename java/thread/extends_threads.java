package thread;

class threads extends Thread{
	
	private String task;
	
	threads(String task){
		this.task=task;
	}
	
	@Override // overrided by thread class 
	public void run() {
		System.out.println(task+Thread.currentThread().getName());
	}
	
}

public class extends_threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Thread t1= new threads("go walk ");
	threads t2= new threads("Drink water ");
	
	t1.start();
	t2.start();
		
	}
}