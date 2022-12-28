
public class RunnableThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r= ()->{
			System.out.println("Current thead name is"+Thread.currentThread().getName());
		};
		
		r.run();

	}

}
