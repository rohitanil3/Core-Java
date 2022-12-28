import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrencySolution {
	
	//single threaded env solution

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList<String>  al = new CopyOnWriteArrayList<>();
		al.add("Rk");
		al.add("Mk");
		al.add("Sk");
		al.add("Lk");
		
		Iterator<String> iterator = al.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			al.add("hk");
			
		}

	}

}
