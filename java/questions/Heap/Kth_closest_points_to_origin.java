package questions.Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Kth_closest_points_to_origin {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 3}, 
            {-2, 2}, 
            {5, 8}, 
            {0, 1}
        };
    
    int k = 2;
    // System.out.println(Arrays.toString(origin(arr,k)));
    System.out.println(Arrays.deepToString(origin(arr, k)));
        
    }

static int[][] origin(int[][] arr, int k){

    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {

        int distanceA = a[0]*a[0] + a[1]*a[1];
        int distanceB = b[0]*b[0] + b[1]*b[1];

        return distanceB - distanceA;

    });

    for(int[] points : arr){

        pq.offer(points);

        if(pq.size() > k){
            pq.poll();
        }

    }

    int[][] ans = new int[k][2];

    for(int i=0; i<k; i++){
        ans[i] = pq.poll();
    }

    return ans;
}

}
