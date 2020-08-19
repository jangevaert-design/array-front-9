public class arrayFront9 {
  public boolean arrayFront9(int[] nums) {
    int l = 4;
    if (nums.length < 4) {
      l = nums.length;
    }

    for (int i = 0; i < l; i++) {
      if (nums[i] == 9) {
        return true;
      }
    }
    return false;
  }
}
