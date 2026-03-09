package searching;
public class linear_search {
    public static void main(String[] args) {

        int[] nums = {6, 3, 2, 5, 1, 3};
        int target = 5;
        int ans = linearsearch(nums, target);
        System.out.println(ans); // returns the 5's index number as "3"

        int target2 = 7;
        int ans2 = linearsearch(nums, target2);
        System.out.println(ans2); // returns -1 because target2's number not in the nums array

        // for min value
        int min=minvalue(nums);
        System.out.println(min);
    }

    static int linearsearch(int[] arr, int target){
        // retruns -1 if array in empty
        if(arr.length==0){
            return -1; 
        }
        //check for element at every index if it is = target
        for(int index=0; index<arr.length; index++){
            if(arr[index]==target){
                return index;
            }
        }
        // if no elements found matching with target then retrun the -1
        return -1;
    }

    // function for find min and max value 
    static int minvalue(int[] arr){
        if(arr.length==0){
            return -1;
        }

        int min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>min){
                min=arr[i];
            }
        }
        return min;
    }
}
