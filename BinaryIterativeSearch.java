
public class BinaryIterativeSearch implements Practice03Search {
  public String searchName() {
    return "binary iterative search";
  }
  
/*
 * Uses iterative search to find the index of the target
 * 
 * @return Gets the index of the target or -1 if it does not exist
 */
  public int search(int [] arr, int target) {
    int start = 0, end = arr.length - 1;
    
    while (start < end) {
      int mid = (start + end) / 2;
      
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] > target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    
    return -1; // value not found
  }
}
