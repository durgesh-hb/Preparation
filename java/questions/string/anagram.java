package questions.string;

import java.util.HashMap;

public class anagram {

    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "listen";
		String s2 = "slinet";
		boolean ans = anagram2(s1, s2);
		System.out.println(ans);

	}

	static boolean anagram2(String s1, String s2) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char ch : s1.toCharArray()) {
			
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			}else {
				map.put(ch, 1);
			}
			
		}
		
		for(char ch : s2.toCharArray()) {
			
			if(!map.containsKey(ch)) {
				return false;
			}else {
				map.put(ch, map.get(ch) - 1);
			}
			
		}
		
		for(int value : map.values()) {
			if(value != 0) {
				return false;
			}
		}
		return true;
	}
	

	static boolean anagram(String s, String t) {
		
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
