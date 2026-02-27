package sorting;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] nums={1, 4, 2, 6, 3, 5};
        selection(nums);
        System.out.println(Arrays.toString(nums));
    
    }
    static void selection(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[smallest]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
}
}