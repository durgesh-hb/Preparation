package questions.arrays.hashing;
public class ransom {

    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String n = "hell";
		String m = "hello";
		boolean ans = ransom(n, m);
		System.out.println(ans);

	}

	
	static boolean ransom(String n, String m) {
		
		int[] count = new int[26];
		
		for(int i=0; i<m.length(); i++) {
			char ch = m.charAt(i);
			count[ ch - 'a']++;
		}
		
		
		for(int i=0; i<n.length(); i++) {
			char ch = n.charAt(i);
			count[ch - 'a']--;
			
			if(count[ch - 'a'] < 0) {
				return false;
			}
			
		}
		return true;
	}
}
