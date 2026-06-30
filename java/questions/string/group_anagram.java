package questions.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class group_anagram {

    public static void main(String[] args) {
        
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

	    group_anagram(strs);
    }

    static void group_anagram(String[] str) {
		
		HashMap<String, List<String>> map = new HashMap<>();
		
		for(String word : str) {
			
			
			char[] ch = word.toCharArray();
			
			Arrays.sort(ch);
			
			String key = new String(ch);
			
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			
			map.get(key).add(word);;
			
		}
		
		System.out.println(map);
}

}
