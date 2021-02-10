public class BubbleSort {
  public static void main(String[] args) {
    
    int[] nums = new int[]{43, 32, 76, -98, 0, 64, 33, -21, 32, 99};
    for (int i = 0; i < nums.length - 1; i += 1) {
      for (int j = 0; j < nums.length - i - 1; j += 1) {
        if (nums[j] > nums[j + 1]) {
          int temp = nums[j];
          nums[j] = nums[j+1];
          nums[j+1] = temp;
        } 
      }
    }
  }
}
