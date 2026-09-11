package revision.sliding_window;

import java.util.HashMap;

public class maximum_sum_of_distinct_subarray_length_k {

    public static void main(String[] args) {

        int[] arr = {1,5,4,2,9,9,9};
        int k =3;
        System.out.println(distinct(arr,k));


    }

    public static int distinct(int[] arr, int k){

        HashMap<Integer, Integer> map = new HashMap<>();

        int start = 0;
        int sum = 0;
        int max_sum = 0;

        for(int end =0; end<arr.length; end++){

            sum += arr[end];
            map.put(arr[end], map.getOrDefault(arr[end], 0) + 1);

            while(end - start + 1 > k){

                sum -=arr[start];
                int count = map.get(arr[start]);

                if(count == 1){
                    map.remove(arr[start]);
                }else{
                    map.put(arr[start], count - 1);
                }
                start++;
            }

            if(map.size() == k && end - start + 1 == k){ 
            max_sum = Math.max(max_sum, sum);
            }
        }

        return max_sum; 

    }
}