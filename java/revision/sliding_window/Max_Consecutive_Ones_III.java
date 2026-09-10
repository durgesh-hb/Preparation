package revision.sliding_window;

public class Max_Consecutive_Ones_III {

    public static void main(String[] args) {

        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(max_ones(arr, k));
        
    }

    public static int max_ones(int[] arr,int  k){

        int start = 0;
        int max = 0;
        int zeromax = 0;

        for(int end = 0; end<arr.length; end++){

            if(arr[end] == 0){
                zeromax++;
            }

            while(zeromax > k){

                if(arr[start] == 0){
                    zeromax--;
                }
                start++;
            }

            max = Math.max(max, end - start + 1);

        }
        return max;
    }
    
}
