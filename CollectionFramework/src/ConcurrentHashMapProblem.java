import java.util.HashMap;
import java.util.Iterator;

public class ConcurrentHashMapProblem extends Thread {
	static HashMap<String,Integer> map=new HashMap<>();

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		map.put("lk", 200);
		
	}

	public static void main(String[] args) {
		ConcurrentHashMapProblem pb=new ConcurrentHashMapProblem();
		pb.start();
		// TODO Auto-generated method stub
		map.put("rk", 1);
		map.put("mk", 12);
		map.put("sk", 11);
		
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(map.get(string));
			map.put("jk", 100);
			
		}
		

	}

}
