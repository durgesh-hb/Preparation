public class peak_of__mountain{
    public static void main(String[] args) {
    int[] nums={0, 1, 2, 2, 2, 0, 6};
    int ans=peak_of_mountain(nums);
    System.out.println(ans);
    }
    static int peak_of_mountain(int[] arr){
        int start=0;
        int end=arr.length-1;
        
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
}