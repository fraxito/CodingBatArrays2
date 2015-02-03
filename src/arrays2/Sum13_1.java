/*
 * 
 */
package arrays2;

/**
 *
 * @author pablo
 */
public class Sum13_1 {
  public int Sum13(int[] nums) {
     int total = 0;
     for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 13) total += nums[i];
        else if (i <= nums.length - 1) i++;
    }
    return total;
}
}
