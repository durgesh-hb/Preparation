package revision.sliding_window;

import java.util.HashMap;

public class fruits_into_buckets{
public static void main(String[] args) {

    int[] arr = {1,2,1};
    int result = totalFruit(arr);
    System.out.println(result);
    

    }

    public static int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> map = new HashMap<>();
        
        int start = 0;
        int max = 0;

        for(int end=0; end<fruits.length; end++){

            map.put(fruits[end],map.getOrDefault(fruits[end], 0) + 1);

            while(map.size() > 2){
                int startfruits = fruits[start];
                int count = map.get(startfruits);

                if(count == 1){
                    map.remove(startfruits);
                }else{
                    map.put(startfruits, count - 1);
                }

                start++;
            }
            max = Math.max(max, end - start + 1);
        }
        return max;
    }

}
