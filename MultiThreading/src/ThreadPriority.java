
public class ThreadPriority extends Thread {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadPriority t1=new ThreadPriority();
		t1.setName("first");
		t1.setPriority(MIN_PRIORITY);
	

		ThreadPriority t2=new ThreadPriority();
		t2.setName("second");
		t2.setPriority(MAX_PRIORITY);
		t1.start();
		t2.start();
		


	}

	@Override
	public void run(){
		for(int i=0;i<300;i++)
		 System.out.println(Thread.currentThread().getName());
	}
}
