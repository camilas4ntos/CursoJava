package curso;

public class FuncoesString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG      ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(4);
		String s05 = original.substring(4, 8);
		String s06 = original.replace("a","x");
		String s07 = original.replace("abc","xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: " +original+ "***");
		System.out.println("ToLowerCase: " + s01+ "***");
		System.out.println("ToUpperCase: " + s02+ "***");
		System.out.println("Trim: " + s03+ "***");
		System.out.println("Substring: " + s04+ "***");
		System.out.println("Substring: " + s05+ "***");
		System.out.println("Replace: " + s06+ "***");
		System.out.println("Replace: " + s07+ "***");
		System.out.println("IndexOf: " + i);
		System.out.println("LastIndexOf: " + j);


		String s = "Camila Santos Cardozo";
		String[] vect = s.split(" ");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
	}

}
