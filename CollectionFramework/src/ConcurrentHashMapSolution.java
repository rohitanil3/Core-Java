import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMapSolution extends Thread {
	static ConcurrentHashMap<String,Integer> map=new ConcurrentHashMap<>();

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		map.put("lk", 200);
		
	}

	public static void main(String[] args) throws InterruptedException {
		ConcurrentHashMapSolution pb=new ConcurrentHashMapSolution();
		pb.start();
		// TODO Auto-generated method stub
		map.put("rk", 1);
		//Thread.sleep(2000);
		map.put("mk", 12);
		map.put("sk", 11);
		
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(map.get(string));
			map.put("jk", 100);
			
		}
		System.out.println(map);
		

	}

}
