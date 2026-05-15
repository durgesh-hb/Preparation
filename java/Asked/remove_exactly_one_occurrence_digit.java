package Asked;

public class remove_exactly_one_occurrence_digit {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Problem Statement
//
//		You are given:
//
//		A string number representing a positive integer
//		A character digit (from '0' to '9')
//
//		Your task is to:
//
//		Remove exactly one occurrence of digit from the string number
//		Such that the resulting number is maximum possible
		
		
		char digit = '1';
		String number = "10";
		remove_one_maximum(number, digit);

	}
	
	 static void remove_one_maximum(String number, char digit) {

	        for (int i = 0; i < number.length() - 1; i++) {

	            if (number.charAt(i) == digit && number.charAt(i) < number.charAt(i + 1)) {

	                String word = number.substring(0, i) + number.substring(i + 1);
	                System.out.println(word);
	                return; 
	            }
	        }

	        //Take everything before the digit + everything after the digit → skip that digit
	        
	        
	        // If no better position found, remove last occurrence
	        int lastindex = number.lastIndexOf(digit);
	        String word2 = number.substring(0, lastindex) + number.substring(lastindex + 1);
	        System.out.println(word2);
	    }
}
