package questions.arrays;

public class remove_duplicate {
    public static void main(String[] args) {
        
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int ans = remove(arr);

        for(int i=0; i<ans; i++){
            System.out.println(arr[i]);
        }

    }

    static int remove(int[] arr) {
		//only if array is sorted
		int count = 0; 
		
		for(int i=1; i<arr.length; i++) {
			
			if(arr[count] != arr[i]) {
				count ++;
				arr[count] = arr[i];
			}
		}
		
		return count + 1; //return the idex of unique value print till there
		
	}

}
