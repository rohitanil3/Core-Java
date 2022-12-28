import java.util.Set;
import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<StringBuffer> set=new TreeSet<>(new SbComparator());
		set.add(new StringBuffer("Rohit"));
		set.add(new StringBuffer("Mahesh"));
		set.add(new StringBuffer("Vidyut"));
		set.add(new StringBuffer("Karan"));
		System.out.println(set);

	}

}
