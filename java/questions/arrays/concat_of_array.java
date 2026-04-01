package questions.arrays;
import java.util.Arrays;
public class concat_of_array {
		
		public static void main(String[] args) {
            // TODO Auto-generated method stub
    
            int array[] = {1, 2, 3};		
            int ans[] = con(array);
            System.out.println(Arrays.toString(ans));
        }
        
        static int[] con(int[] arr){
            
            int size = arr.length;
            
            int[] newarr =new int[size * 2]; //create twice the original array 
            
            for(int i=0; i<arr.length; i++) {// simultaneously storing one value in two index
                newarr[i] = arr[i];
                newarr[i + size] = arr[i];
            }
            
            return newarr;
        }
}
