package revision.prefix_sum;

import java.util.HashMap;

public class Subarray_Sums_Divisible_by_K {

    public static void main(String[] args) {

        

    }

    public int subarraysDivByK(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int count = 0;
        map.put(0,1);

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            int reminder = sum % k;

            if (reminder < 0) {
                reminder += k;
            }

            if(map.containsKey(reminder)){
                count += map.get(reminder);
            }

            map.put(reminder, map.getOrDefault(reminder, 0) +1);
        }
        return count;
    }

}