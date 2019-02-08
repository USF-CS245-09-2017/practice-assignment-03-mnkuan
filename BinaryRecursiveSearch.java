
public class BinaryRecursiveSearch implements Practice03Search {
  public String searchName() {
    return "binary recursive search";
  }
  
  /*
   * Uses binary recursive search for the target
   * 
   * @return Gets the index of the target or -1 if it does not exist
   */
  public int search(int[] arr, int target) {
    return search(arr, target, 0, arr.length);
  }
  
  /*
   * Method overload that performs the same function as binary recursive search
   */
  public int search(int[] arr, int target, int start, int end) {
    int mid = (start + end - 1) / 2;
    
    // Base case
    if (end < start) {
      return -1;
    }
    
    if (arr[mid] == target) {
      return mid;
    } else if (arr[mid] > target) {
      return search(arr, target, start, mid);
    } else {
      return search(arr, target, mid + 1, end);
    }
  }
}
