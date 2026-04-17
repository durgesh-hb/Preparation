package questions.arrays;

public class best_time_to_huy_stcok {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7, 1, 5, 3, 6, 4};
		int ans = besttime(arr);
		System.out.println(ans);
	}
	
	static int besttime(int[] arr) {
		
		int minprice = 100;
		int maxprofit = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < minprice) {
				minprice = arr[i];
			}else {
				maxprofit = Math.max(maxprofit, arr[i] - minprice);
			}
			
		}
		return maxprofit;
	}
}
