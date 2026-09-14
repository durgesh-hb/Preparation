package revision.prefix_sum;

import java.util.HashMap;

public class Continuous_Subarray_Sum {

    public static void main(String[] args) {

        int[] arr = {23,2,4,6,7};
        int k = 6;
        System.out.println(checkSubarraySum(arr,k));
        
    }
    
    public static boolean checkSubarraySum(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        map.put(0, -1);
        for(int i=0; i<nums.length; i++){

            sum += nums[i];
            int reminder = sum % k;

            if(map.containsKey(reminder)){
                int currentindex = i;
                int previousindex = map.get(reminder);
                int length = currentindex - previousindex;

                if(length >= 2){
                    return true;
                }   
            }else{
                map.put(reminder, i);
            }
        }

        return false;
    }

}
