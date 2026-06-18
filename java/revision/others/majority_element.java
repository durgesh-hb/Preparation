package revision.others;

public class majority_element {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2, 2, 1, 1, 1, 2, 2, 1, 1};
		int ans = majorityelement(arr);
		System.out.println(ans);
	}
	
	static int majorityelement(int[] arr) {
		// boyer moore algorithm
		int cand = 0;
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(count == 0) {
				cand = arr[i];
			}
			
			if(arr[i] == cand) {
				count++;
			}else {
				count--;
			}
		}
		return cand;
	}
    
}
