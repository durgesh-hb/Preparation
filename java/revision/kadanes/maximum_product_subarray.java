package revision.kadanes;

public class maximum_product_subarray {

    public static void main(String[] args){

        int[] arr ={2,3,-2,4};
        System.out.println(maxproduct(arr));

    }

    public static int maxproduct(int[] nums) {

        int prefix = 1;
        int suffix = 1;
        int ans = Integer.MIN_VALUE;;;

        for(int i=0; i<nums.length; i++){

            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;

            prefix *= nums[i];
            suffix *= nums[nums.length -1 -i];

            ans = Math.max(ans,Math.max(prefix, suffix));

        }
        return ans;
    }
    
}
