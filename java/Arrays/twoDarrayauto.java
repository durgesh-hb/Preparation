package Arrays;
public class twoDarrayauto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] arr=new int[3][3];
		int value=0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=value;
				value++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
