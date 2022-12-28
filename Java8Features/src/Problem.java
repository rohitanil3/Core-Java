import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "AAABBBsda";
		Map<String, Long> charCount = word.chars().mapToObj(c -> Character.toString((char) c))
		        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		charCount.forEach((key,value)->System.out.println(key +" "+value));

	}

}
