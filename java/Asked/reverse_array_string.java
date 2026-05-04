package Asked;
import java.util.HashSet;
public class reverse_array_string {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 3, 3, 2, 4, 5, 1};
//		duplicates(arr);
		dup(arr);
	}
	
	static void duplicates(int[] arr) { //with extra space
		
		HashSet<Integer> s = new HashSet<>();
		
		for(int num : arr) {
			
			if(s.contains(num)) {
				System.out.println(num);
			}else {
				s.add(num);
			}
		}
		
	}
	
	static void dup(int[] arr) { //without extra space but o(n2)
		
		for(int i=0; i<arr.length; i++) {
			for(int j= i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
				    break;
				}
			}
		}
		
	}
}
