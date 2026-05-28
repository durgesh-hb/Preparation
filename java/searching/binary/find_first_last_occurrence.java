package searching.binary;

public class find_first_last_occurrence {
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5,7,7,8,8,10};
		int target = 7;
		int first = first_last(arr,target, true);
		int second = first_last(arr, target, false);
		
		System.out.println("First occerence is = " + first);
		System.out.println("Second occerence is = " + second);
	}
	
	static int first_last(int[] arr, int target, boolean first) {
		
		int start = 0;
		int end = arr.length-1;
		int ans = 0;
		
		while(start <= end) {
			
			int mid = start + (end - start) / 2;
			
			if(target < arr[mid]) {
				end = mid - 1;
			}else if(target > arr[mid]) {
				start = mid + 1;
			}else {
				
				ans = mid;
				
				if(first) {
					end = mid - 1; // move full left
				}else {
					start = mid + 1; // move full right
				}
				
			}
			
		}
		return ans;
	}

//    for first, last and 3rd occurrence
	
//	  int[] arr = {1,2,2,2,2,3,4};
//      int target = 2;
//      int k = 3;
//
//      int first = search(arr, target, true);
//
//      // target not found
//      if(first == -1) {
//	    System.out.println("Target not found");
//	    return;
//	}
//	
//		int count = last - first + 1;
//	
//		check kth occurrence exists or not
//		if(k > count) {
//	    	System.out.println(k + "th occurrence does not exist");
//		}
//		else {
//	
//	    int index = first + (k - 1);
//	
//	    System.out.println(k + "th occurrence index is: " + index);
//}
//
//  }
//
//  static int search(int[] arr, int target, boolean findFirst) {
//
//      int start = 0;
//      int end = arr.length - 1;
//      int ans = -1;
//
//      while(start <= end) {
//
//          int mid = start + (end - start) / 2;
//
//          if(arr[mid] < target) {
//              start = mid + 1;
//          }
//
//          else if(arr[mid] > target) {
//              end = mid - 1;
//          }
//
//          else {
//
//              ans = mid;
//
//              if(findFirst) {
//                  end = mid - 1; // move LEFT
//              }
//
//              else {
//                  start = mid + 1; // move RIGHT
//              }
//          }
//      }
//
//      return ans;
  
	
}
