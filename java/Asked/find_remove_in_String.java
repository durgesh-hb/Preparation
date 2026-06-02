package Asked;

import java.util.HashSet;

public class find_remove_in_String {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		String world = "programming";
		dup(world);
		
		remove_dup(world);
	}
	
	static void dup(String world) {
		
		HashSet<Character> name= new HashSet<>();
		
		for(int i=0; i<world.length(); i++) {
			
			 char letter= world.charAt(i);
			 if(name.contains(letter)) {
				 System.out.println("duplicate : " + letter);
			 }else {
				 name.add(letter);
			 }
			
		}
	}
	
	static void remove_dup(String world) {
		
		HashSet<Character> name= new HashSet<>();
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<world.length(); i++) {
			char letter=world.charAt(i);
			if(!(name.contains(letter))) {
				name.add(letter);
				result.append(letter);
			}
		}
		System.out.println(result);
	}

    
}
