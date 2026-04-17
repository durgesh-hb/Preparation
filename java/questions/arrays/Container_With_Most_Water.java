package questions.arrays;

public class Container_With_Most_Water {
    
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int ans = maxArea(arr);
        System.out.println(ans);
        
    }
    static int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;
    
        while (left < right) {
    
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int area = h * w;
    
            maxWater = Math.max(maxWater, area);
    
            // Move smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
    
        return maxWater;
    }
}
