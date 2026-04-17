package questions.arrays;

public class trapping_rain_water {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
		int[] arr = {3, 0, 1, 3};
		int ans = trappedwater(arr);
		System.out.println(ans);
    }

    static int trappedwater(int[] height){

        int left = 0;
        int right =height.length-1;
        int leftmax = 0;
        int rightmax = 0;
        int water = 0;

        while(left < right){

            if(height[left] < height[right]){
                
                if(height[left] >=leftmax){
                    leftmax = height[left]; //update the leftmax value
                }else{
                    water += left - height[left]; //trapped water
                }
                left++;
            }else{
                if(height[right] >= rightmax){
                    rightmax = height[right]; //update the rightmax 
                }else{
                    water += rightmax - height[right]; //trapped water
                }
                right--;
            }

        }
        return water;
    }
    
}