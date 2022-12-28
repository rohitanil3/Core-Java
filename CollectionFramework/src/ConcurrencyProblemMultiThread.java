import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrencyProblemMultiThread extends Thread {

	// multi threaded env problem
	static ArrayList<String> al = new ArrayList<>();

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		al.add("pk");
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		al.add("Rk");
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
