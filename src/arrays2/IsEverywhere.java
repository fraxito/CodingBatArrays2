/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;

/**
 *
 * @author javier
 */
public class IsEverywhere {
    public boolean isEverywhere(int[] nums, int val) {
    boolean flag1 = true;
    boolean flag2 = true;
 
    for (int i = 0; i < nums.length; i += 2)
        if (nums[i] != val) flag1 = false;
 
    for (int i = 0; i < nums.length - 1; i += 2)
        if (nums[i + 1] != val) flag2 = false;
 
    return flag1 || flag2;
}
}