package questions.string;

public class palindrome {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "A";
		boolean ans = palindrome(s);
		System.out.println(ans);
		
	}
	
	static boolean palindrome(String s) {
		
		if(s.length() == 0) {
			return true;
		}
		
		int left = 0;
		int right = s.length()-1;
		
		while(left < right) {
			
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
			
		}
		
		return true;
		
	}
}
