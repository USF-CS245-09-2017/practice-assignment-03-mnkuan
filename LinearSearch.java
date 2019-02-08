
public class LinearSearch implements Practice03Search {
  public String searchName() {
    return "linear Search";
  }
  
  /*
   * Uses linear search for the target
   * 
   * @return Gets the index of the target or -1 if it does not exist
   */
  public int search(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        return i;
      }
    }
    
    return -1;
  }
}
