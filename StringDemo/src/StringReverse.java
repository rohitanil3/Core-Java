
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Rohit";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--){
			 reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);

	}

}
