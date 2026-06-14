package sorting;
import java.util.Arrays;
public class insertion_sort {
    public static void main(String[] args) {

        int[] arr = { 4, 2, 6, 1, 7, 9};

        for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j>0; j--) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
    }
    
}
