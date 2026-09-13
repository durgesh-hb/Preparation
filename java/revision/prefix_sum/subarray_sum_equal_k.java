package revision.prefix_sum;

import java.util.HashMap;

public class subarray_sum_equal_k {

    public static void main(String[] args) {

        int[] nums =  {1,1,1};
        int k = 2;
        System.out.println(subarray(nums, k));
        
    }

    public static int subarray(int[] nums, int k){

        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixsum = 0;
        map.put(0, 1);
        int count = 0;

        for(int i=0; i<nums.length; i++){

            prefixsum += nums[i];
            int needed = prefixsum - k;
            if(map.containsKey(needed)){
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
                count++;
            }

            map.put(nums[i], 1);
        }

        return count;
    }
    
}
