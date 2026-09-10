package revision.prefix_sum;

public class find_pivot_index {
    public static void main(String[] args) {

        int[] arr = {1,7,3,6,5,6};
        System.out.println(pivot(arr));
        
    }

    public static int pivot(int[] nums){

        int total_sum = 0;
        for(int i=0; i<nums.length; i++){
            total_sum += nums[i];
        }

        int left_sum = 0;
        for(int i=0; i<nums.length; i++){
            
            int right = total_sum - left_sum - nums[i];
            if(left_sum == right){
                return i;
            }
            left_sum += nums[i];
        }
        return -1;

    }
    
}
