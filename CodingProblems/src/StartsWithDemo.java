import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWithDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums=new ArrayList<>();
		nums.add(10);
		nums.add(515);
		nums.add(111);
		nums.add(6160);
		nums.add(14);
		
		List<String> collect = nums.stream().map(s->s+"").filter(s->s.startsWith("1")).collect(Collectors.toList());
		System.out.println(collect);

	}

}
