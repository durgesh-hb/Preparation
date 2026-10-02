package questions.string.sliding_window;

import java.util.HashMap;

public class Longest_Substring_with_K_Uniques {

    public static void main(String[] args) {

        String s = "aabacbebebe";
        int k = 3;
        
        System.out.println(longestKsubstr(s,k));
        
    }

    public static int longestKsubstr(String s, int k) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        int start = 0;
        int maxlength = -1;
        
        for(int end=0; end<s.length(); end++){
            
            map.put(s.charAt(end), map.getOrDefault(s.charAt(end),0)+1);
            
            while(map.size() > k){
                
              char ch = s.charAt(start);
              
              map.put(ch, map.get(ch) - 1);
              
              if(map.get(ch) == 0){
                  map.remove(ch);
              }
                start++; 
            }
            
            if(map.size() == k){
                maxlength = Math.max(maxlength, end - start + 1);
            }
            
        }
        return maxlength;
    }
    
}
