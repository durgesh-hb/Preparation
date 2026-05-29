package searching.binary;

public class ceiling_flooring {

    public static void main(String[] args) {
		
		
        //		arr = [10,20,30,40,50]
        //		target = 35
        //		ans = for ceiling 40 and flooring 30
                
                
                int[] arr = { 10, 20, 30, 40, 50};
                int target = 35;
                int ans = ceiling(arr, target);
                System.out.println(ans);
                
            }
            
            static int ceiling(int[] arr, int target) {
                
                int start = 0;
                int end = arr.length-1;
                
                while(start <= end) {
                
                    int mid = start + (end - start) / 2;
                    
                    if(target < arr[mid]) {
                        end = mid - 1;
                    }else if(target > arr[mid]) {
                        start = mid + 1;
                    }else {
                        return arr[mid]; //means got the equal element
                    }
                }
                // both start & end crossed each other cause didn't find equal element so return start
                return arr[start];  
                
                //do return arr[end] for flooring
                
            }
    
}
