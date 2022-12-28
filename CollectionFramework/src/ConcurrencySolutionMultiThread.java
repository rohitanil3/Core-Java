import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrencySolutionMultiThread extends Thread {

	// multi threaded env solution
	static CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<>();

	@Override
	public void run() {

		al.add("pk");
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) throws InterruptedException {
		ConcurrencySolutionMultiThread thread=new ConcurrencySolutionMultiThread();
		thread.start();
		// TODO Auto-generated method stub
		al.add("Rk");
		//Thread.sleep(5000);
		al.add("Mk");
		al.add("Sk");
		al.add("Lk");

		Iterator<String> iterator = al.iterator();
		while (iterator.hasNext()) {
			Thread.sleep(5000);
			System.out.println(iterator.next());
			al.add("hk");

		}

	}

}
