package questions.arrays.hashing;

import java.util.HashMap;

public class subarray_sum_equal_k {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int k = 3;
        int ans = subarraySum(arr, k);
        System.out.println(ans);
        
    }
    static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);  // important
        
        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

}
