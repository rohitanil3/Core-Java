import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrencyProblem {
	
	//single threaded env problem

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>  al = new ArrayList<>();
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
