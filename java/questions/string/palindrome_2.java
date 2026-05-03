package questions.string;

public class palindrome_2 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Input: s = "A man, a plan, a canal: Panama"
//		Output: true
		
		String s = "race a car";
		boolean ans = validpalindrome(s);
		System.out.println(ans);
	}
	
	static boolean validpalindrome(String s) {
		
		int left = 0;
		int right = s.length()-1;
		
		while(left < right) {
            // skip special characters from left
			while(left < right && !Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}
            // skip special characters from right
			while(left < right && !Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}
			
			
			char l = Character.toLowerCase(s.charAt(left));
			char r = Character.toLowerCase(s.charAt(right));
			
			if(l != r) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
