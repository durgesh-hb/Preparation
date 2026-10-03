package questions.string.sliding_window;
import java.util.Arrays;
public class Permutation_in_String {

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        System.out.println(permutation(s1,s2));
        
    }

    public static boolean permutation(String s1, String s2) {

        int[] s1freq = new int[26];
        int[] windowfreq = new int[26];

        int start = 0;

        for(int i =0; i<s1.length(); i++){
            s1freq[s1.charAt(i) - 'a']++;
        }

        for(int end = 0; end<s2.length(); end++){

            windowfreq[s2.charAt(end) - 'a']++;

            if(end - start + 1 > s1.length()){
                
                windowfreq[s2.charAt(start) - 'a']--;
                start++;

            }

            if(end - start + 1 == s1.length()){
                if(Arrays.equals(windowfreq, s1freq)){
                    return true;
                }
            }

        }
        return false;
    }
    
}
