package revision.kadanes;

public class maximum_subarray_sum{

    public static void main(String[] args) {

        int[] arr ={-2,1,-3,4,-1,2,1,-5,4};  
        System.out.println(maxSubArray(arr));
        
    }

    public static int maxSubArray(int[] nums) {
        
        int current = nums[0];
        int max = nums[0];

        for(int i = 1; i < nums.length; i++){

            current = Math.max(nums[i], current + nums[i]);

            max = Math.max(max, current);
        }
        return max;
    }
}