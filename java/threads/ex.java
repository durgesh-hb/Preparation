package threads;

class thread extends Thread{ //this is one type for creating thread through extends

    private String task;

    thread(String task){
        this.task=task;
    }

    @Override
    public void run(){ // run method is overriden from Thread class
        System.out.println(task + getName());
    }

}

public class ex {
    public static void main(String[] args) {
        
        Thread t1= new thread("go for a walk ");
        thread t2=new thread("drink water ");
        t1.start();
        t2.start();
    }
}
