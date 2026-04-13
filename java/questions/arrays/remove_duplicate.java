package questions.arrays;

public class remove_duplicate {
    public static void main(String[] args) {
        
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        removedup(arr);

        
        
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

    static void removedup(int[] arr){

        int k=0;

        for(int i=0; i<arr.length; i++){

            boolean seen = false;
            for(int j=0; j<k; j++){
                if(arr[i] == arr[j]){
                   seen = true;
                   break;
                }
            }


            if(!seen){
                arr[k] = arr[i];
                k++;
            }
        }

		for(int i=0; i<k; i++) {
			System.out.println(arr[i]);
		}

    }

}
