package revision.arrays;

public class best_time_to_buy_and_sell {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {7,1,5,3,6,4};
		buy_stock(arr);
	}
	
	static void buy_stock(int[] arr) {
		
		int min = Integer.MAX_VALUE;
		int maxprofit = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] < min) {
				min = arr[i];
			}else {
				maxprofit = Math.max(maxprofit, arr[i] - min );
			}
			
		}
		
		System.out.println(maxprofit);
	}
}
