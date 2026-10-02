package questions.string.sliding_window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class find_all_the_anagrams_in_string {

    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p = "abc";

        find_all_the_anagrams_in_string solver = new find_all_the_anagrams_in_string();
        List<Integer> result = solver.findAnagrams(s, p);

        // Print the result
        System.out.println("Anagram starting indices: " + result);

        
    }

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();
    
        int[] pfreq = new int[26];
        int[] windowfreq = new int[26];
    
        int windowsize = p.length();
        int start = 0;
    
        for(int i=0; i<p.length(); i++){
            pfreq[p.charAt(i) - 'a']++;
        }
    
        for(int end=0; end<s.length(); end++){
    
            windowfreq[s.charAt(end) - 'a']++;
    
            if(end - start + 1 > windowsize){
                windowfreq[s.charAt(start) - 'a']--;
                start++;
            }
    
            if(end - start + 1 == p.length()){
                if(Arrays.equals(pfreq, windowfreq)){
                    result.add(start);
                }
            }
    
        }
        return result;
        }
        
}
