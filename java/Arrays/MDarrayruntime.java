package Arrays;
import java.util.Scanner;
public class MDarrayruntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        
		System.out.println("Enter the number of rows = ");
		int row = sc.nextInt();
		
		System.out.println("Enter the number of columns = ");
		int cal = sc.nextInt();
		
		int[][] arr=new int[row][cal];
		
		System.out.println("enter the values now in "+ row +" "+cal);
		// taking the input in runtime from user
		for(int i=0; i<row; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		// for printing
		for(int i=0; i<row; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	sc.close();
		
	}
}