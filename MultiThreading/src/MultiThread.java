
public class MultiThread extends Thread {

	public static void main(String[] args) throws InterruptedException {
		
		MultiThread t=new MultiThread();
		t.start();
		// TODO Auto-generated method stub
		for (int i = 0; i < 200; i++) {
			System.out.println("i "+i);
			Thread.sleep(1000);
		}

	}
	
	public void run(){
		
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
