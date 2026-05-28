package searching;
public class binary_search{
    public static void main(String[] args) {
        int[] arr={1,2,4,6,7,8,12,16};
        int target=12;
        int ans=biinear_search(arr, target);
        System.out.println(ans);
    }
    //Divide the array → check → move left/right → repeat 
    //array should always to be sorted for binary search
    static int biinear_search(int[] arr, int target){
         int start = 0;
         int end = arr.length - 1;

        while(start <= end) { 

        int mid = start + (end - start) / 2;

        if (target < arr[mid]) {
            end = mid - 1;
        } else if (target > arr[mid]) {
             start = mid + 1;
        } else {
         return mid;
     }
     }
     return -1; //for not found element if want return the 
                //where the target should be added to return there index, return start instead of -1
}
}