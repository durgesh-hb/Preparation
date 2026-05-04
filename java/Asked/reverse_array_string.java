package Asked;
import java.util.Arrays;
public class reverse_array_string {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 3, 4, 5};
		reverse_arr(arr);
		System.out.println(Arrays.toString(arr));
		
		String word = "hello";
		String ans = revers_string(word);
		System.out.println(ans);
	}
	
	static void reverse_arr(int[] arr) {
		
		int left = 0;
		int right = arr.length-1;
		 while(left < right) {
			 int temp = arr[left];
			 arr[left] = arr[right];
			 arr[right] = temp;
			 left++;
			 right--;
		 }
	}

	static String revers_string(String s) {
		
		char[] ch=s.toCharArray();
		
		int left = 0;
		int right = ch.length-1;
		
		while(left < right) {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left++;
			right--;
		}
		
		return new String(ch);
	}
	
}
