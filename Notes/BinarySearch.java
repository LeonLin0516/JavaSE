public class BinarySearch {
  public static void main(String[] args) {
    int[] nums = {-98, -34, 2, 34, 54, 66, 79, 105, 210, 333};
    int dest = 34;
    int front = 0;
    int back = nums.length - 1;
    int mid;
    boolean isFlag = true;
    while (front <= back) {
      mid = (front + back) / 2;
      if (nums[mid] == dest) {
        System.out.println("The element is located at " + mid);
        isFlag = false;
        break;
      } else if (nums[mid] > dest) {
        back = mid - 1;
      } else {
        front = mid + 1;
      }
    }
    if (isFlag) {
      System.out.println("The element does not exist");
    }
  }
}
