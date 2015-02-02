/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;

/**
 *
 * @author alvaro
 */

public class More14{
public boolean More14(int[] nums) {
  int ones = 0;
    int fours = 0;
 
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 1) ones++;
        if (nums[i] == 4) fours++;
    }
    return ones > fours;
}
}