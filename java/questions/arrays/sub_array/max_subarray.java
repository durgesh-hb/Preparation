package questions.arrays.sub_array;

public class max_subarray {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
		
//		Given an integer array nums, find the subarray with the largest sum, and return its sum.
//
//				Example 1
//				Input:
//				nums = [-2,1,-3,4,-1,2,1,-5,4]
//				Output:
//				6
		
		int[] arr= {5 ,4 , -1, 7, 8};
		int ans = max(arr);
		System.out.println(ans);
    }

    static int max(int[] arr){

        int current = 0;
        int max = -1;

        for(int i=0; i<arr.length; i++){

            current += arr[i];

            if(current > max){
                max = current;
            }

            if(current < 0){
                current = 0;
            }

        }
        return max;
    }
    
}
