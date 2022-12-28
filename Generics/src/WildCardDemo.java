import java.util.ArrayList;

public class WildCardDemo {
	
	public void myMethod(ArrayList<? extends Thread> al){
		
		al.add(null);
		//al.add(new Thread()); error this is only to read-only purpose
	}

}
