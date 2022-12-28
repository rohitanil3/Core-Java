package solution.word.problems;

public class ReverseWordChars {

	public static void main(String[] args) {
		// Write a program to reverse each word

		String s = "Java is a language!!";
		System.out.println("string length " + s.length());

		String[] stringarr = s.split(" ");
		int count = stringarr.length - 1;
		System.out.println("split count " + count);
		String reverse = "";
		for (int i = 0; i < stringarr.length; i++) {
			char[] chararr = stringarr[i].toCharArray();

			for (int j = chararr.length - 1; j >= 0; j--) {
				reverse += chararr[j];

			}
			if (count > 0) {
				reverse += " ";// you could use the trim() method instead
				
				count--;
			}
		}

		System.out.println(reverse.length());
		System.out.println(reverse);
	}

}
