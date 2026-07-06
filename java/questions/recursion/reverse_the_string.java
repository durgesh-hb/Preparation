package questions.recursion;

public class reverse_the_string {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverse("JAVA"));
	}
	
	static String reverse(String word) {
		
		if(word.length() <= 1) {
			return word;
		}
		
		return reverse(word.substring(1)) + word.charAt(0);
	}

}
