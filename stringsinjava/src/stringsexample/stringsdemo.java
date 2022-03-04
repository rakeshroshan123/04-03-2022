package stringsexample;

public class stringsdemo {
	public static void main(String[] args) {

		String str = "this is a string";
		String quote = new String("Strings In Java");
		char[] name = { 'r', 'a', 'k', 'e', 's', 'h', 'r', 'o', 's' };
		String myname = new String(name);

		System.out.println(myname.charAt(0));
		System.out.println(myname.substring(5));
		System.out.println(myname.substring(0, 8));
		System.out.println(myname.startsWith("r"));
		System.out.println(myname.endsWith("s"));
		System.out.println(myname.compareTo("chiranjeev"));

		/*
		 * "Mumbai".compareTo("Andhra Pradesh"));
		 * 
		 * 
		 * String str = new String("This is a String"); String str1 =
		 * "This is a String";
		 * System.out.println(str.concat(" In Java,which is immutable"));
		 * 
		 * 
		 * System.out.println(str.equals(str1));
		 * 
		 * 
		 * String str = "This is a String"; String[] words = str.split(" ");
		 * System.out.println("String divided in to words..........");
		 * System.out.println("======================================="); for(String w :
		 * words) { System.out.println(w); }
		 * 
		 */

	}
}
