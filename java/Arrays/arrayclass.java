package Arrays;

import java.util.Arrays;

public class arrayclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int arr[]= {1,4,2,5,2,66,4,3,};
Arrays.sort(arr);
int key=66;
System.out.println("the index is:: "+Arrays.binarySearch(arr, key));
System.out.println("  ");
System.out.println("the index is:: "+Arrays.binarySearch(arr,4,8, key));
System.out.println(arr.length);
	}

}