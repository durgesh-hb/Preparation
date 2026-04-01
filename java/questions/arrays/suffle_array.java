package questions.arrays;
import java.util.Arrays;
public class suffle_array {

    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {2, 5, 1, 3, 4, 7};
		int mid = 3;
		
		int ans[] = suffle(array, mid);
		System.out.println(Arrays.toString(ans));
		
	}
	
	static int[] suffle(int arr[],int n) {
		int newarr[] = new int[arr.length];
		
		for(int i=0; i<n; i++) {
			newarr[2 * i] = arr[i]; //first index 
			newarr[2 * i + 1] = arr[i + n]; //second index
		}
		
		return newarr;
	}

    
}
