package questions.recursion.pratice_problems;

public class palindrome {

    public static void main(String[] args) {
        
    }

    public boolean isPalindrome(int n) {
        // code here
        String str = String.valueOf(n);
        
        return check(str,0,str.length()-1);
    }
    
    boolean check(String str, int left, int right){
        
        if(left >= right){
            return true;
        }
        
        if(str.charAt(left) != str.charAt(right)){
            return false;
        }
        
        return check(str,left+1, right-1);
    }
    
}
