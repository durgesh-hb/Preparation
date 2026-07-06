package questions.recursion.arrays;

public class check_if_array_is_sorted {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {1, 7, 2, 3, 4};
        int index = 0;

        System.out.println(Issorted(arr, 0));
	}

    static boolean Issorted(int[] arr, int index){

        if(index == arr.length-1){
            return true;
        }

        if(arr[index] > arr[index+1]){
            return false;
        }

        return Issorted(arr, index+1);

    }
}
