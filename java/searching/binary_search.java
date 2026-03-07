public class binary_search{
    public static void main(String[] args) {
        int[] arr={4, 6, 1, 2, 16, 7, 8, 12,};
        int target=12;
        int ans=biinear_search(arr, target);
        System.out.println(ans);
    }
    //Divide the array → check → move left/right → repeat 
    
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
     return -1;
}
}