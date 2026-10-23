package questions.recursion.divide_and_conquer; 

import java.util.Arrays; 
public class merge_sort {
    public static void main(String[] args) {

        int[] arr = {8, 3, 5, 1};
        mergesort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void mergesort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        //Left sort
        mergesort(arr, left, mid);
        // Right sort 
        mergesort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    } 

    static void merge(int[] arr, int left, int mid, int right) {
        int[] leftArr = Arrays.copyOfRange(arr, left, mid + 1);
        int[] rightArr = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0;
        int j = 0;
        int k = left; 

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < leftArr.length) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < rightArr.length) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
