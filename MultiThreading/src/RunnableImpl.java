
public class RunnableImpl implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableImpl t=new RunnableImpl();
		Thread t1=new Thread(t);
		t1.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int j = 0; j < 200; j++) {
			System.out.println("j "+j);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
