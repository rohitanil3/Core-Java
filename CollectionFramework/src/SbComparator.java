import java.util.Comparator;

public class SbComparator implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		// TODO Auto-generated method stub
		String string = o1.toString();
		String string2 = o2.toString();
		return string.compareTo(string2);
	}

}
