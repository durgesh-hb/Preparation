package questions.stack.monotonic_stack;

import java.util.Stack;

public class Largest_Rectangle_in_Histogram {

    public static void main(String[] args) {
        
    }
    
    // brute force 
    public int largestRectangle(int[] heights) {

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

    // optimized
    public int largestRectangleArea(int[] heights) {

        int maxarea = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<=heights.length; i++){
            int h = (i == heights.length) ? 0 : heights[i];
            while(!stack.isEmpty() && h < heights[stack.peek()]){
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;

                int area = height * width;
                maxarea = Math.max(area, maxarea);
            }
            stack.push(i);
        }
        return maxarea;
    }
}
 