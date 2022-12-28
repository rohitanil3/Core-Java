import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NoofChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=(List) Arrays.asList(1,1,5,54,2,3,27,27,27);
		
		Map<Integer,Integer> countMap=new HashMap<>();
		for (Integer integer : list) {
			if(countMap.containsKey(integer)){
				countMap.put(integer, countMap.get(integer)+1);
			}else{
				countMap.put(integer, 1);
			}
			
		}
		
		for (Entry<Integer, Integer> entry : countMap.entrySet()) {
			System.out.println("Integer = " + entry.getKey() +
                    ", has occurences = " + entry.getValue());
			
		}
	

	}

}
