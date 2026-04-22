package questions.string;
public class roman_to_integer {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		String roman = "MCM";
		int ans = roman(roman);
		System.out.println(ans);
		
	}
	
	static int roman(String s) {
		
		if(s.length()==0) {
			return 0;
		}
		
		int total = 0;
		for(int  i=0; i<s.length(); i++) {
			
			int current = value(s.charAt(i));
			
			if(i < s.length() -1 && current < value(s.charAt(i + 1))) {
				total -= current;
			}else {
				total += current;
			}
			
		}
		
		return total;
	}
	
	static int value(char c) {
		
		if(c == 'I') return 1;
		if(c == 'V') return 5;
		if(c == 'X') return 10;
		if(c == 'L') return 50;
		if(c == 'C') return 100;
		if(c == 'D') return 500;
		return 1000; //M
		
	}
	

}
