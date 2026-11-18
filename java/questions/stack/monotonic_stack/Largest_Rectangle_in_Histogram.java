package questions.stack.monotonic_stack;

public class Largest_Rectangle_in_Histogram {

    public static void main(String[] args) {
        
    }
    
    public int largestRectangleArea(int[] heights) {

        int maxarea = 0;
        for(int i=0; i<heights.length; i++){
            int h = heights[i];
            for(int j=i; j<heights.length; j++){
                h = Math.min(h, heights[j]);
                int width = j - i + 1;
                int area = h * width;

                maxarea = Math.max(maxarea, area);
            }
        }
        return maxarea;
    }
}
