package questions.string.sliding_window;

public class minimum_window_substring {

    public static void main(String[] args) {
        
    }

    public String minWindow(String s, String t) {

        if (t.length() > s.length()) {
            return "";
        }

        int[] tfreq = new int[128];
        int[] windowfreq = new int[128];

        int start = 0;

        int startOfAns = 0;
        int minLength = Integer.MAX_VALUE;

        int formed = 0;
        int required = 0;

        for (int i = 0; i < t.length(); i++) {

            if (tfreq[t.charAt(i)] == 0) {
                required++;
            }

            tfreq[t.charAt(i)]++;
        }

        for (int end = 0; end < s.length(); end++) {

            char ch = s.charAt(end);

            windowfreq[ch]++;

            if (windowfreq[ch] == tfreq[ch]) {
                formed++;
            }

            while (formed == required) {

                if (end - start + 1 < minLength) {
                    minLength = end - start + 1;
                    startOfAns = start;
                }

                char leftChar = s.charAt(start);
                windowfreq[leftChar]--;

                if (windowfreq[leftChar] < tfreq[leftChar]) {
                    formed--;
                }

                start++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(startOfAns, startOfAns + minLength);
    }
    
}
