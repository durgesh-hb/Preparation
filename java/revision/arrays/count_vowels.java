package revision.arrays;

public class count_vowels {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "automation";
		vowels(name);
	}
	
	static void vowels(String word) {
		
		int vowels = 0;
		int constent = 0;
		word.toLowerCase();
		for(int num : word.toCharArray()) {
			if("aeiou".indexOf(num) != -1) {
				vowels++;
			}else {
				constent++;
			}
		}
		System.out.println(vowels);
		System.out.println(constent);
	}
}
