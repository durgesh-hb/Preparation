package questions.string;

public class anagram {

    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "listen";
		String s2 = "slnet";
		boolean ans = valid_anagram(s1, s2);
		System.out.println(ans);

	}
	static boolean valid_anagram(String s, String t) {
		
			if(s.length() != t.length()) {
				return false;
			}
			int[] freq = new int[26];
			
			for(int i=0; i<s.length(); i++) {
				freq[s.charAt(i) - 'a']++;
				freq[t.charAt(i) - 'a']--;
			}
			
			for(int i=0; i<s.length(); i++) {
				if(freq[i] != 0) {
					return false;
				}
			}
		return true;
	}
    
}
