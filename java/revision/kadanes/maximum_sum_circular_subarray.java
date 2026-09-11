package revision.kadanes;

public class maximum_sum_circular_subarray{

    public static void main(String[] args){

        int[] arr = {1,-2,3,-2};
        System.out.println(circularsum(arr));

    }

    public static int circularsum(int[] nums) {

        int currentmax = nums[0];
        int max = nums[0];

        int currentmin= nums[0];
        int min = nums[0];

        int total = nums[0];

        for(int i=1; i<nums.length; i++){

            total += nums[i];

            currentmax = Math.max(nums[i], currentmax + nums[i]);
            max = Math.max(max, currentmax);

            currentmin = Math.min(nums[i], currentmin + nums[i]);
            min = Math.min(min, currentmin);

        }      
        if(max < 0){
                return max; 
        }

        int circularsum = total - min;

        return Math.max(max, circularsum);
        
    }

}