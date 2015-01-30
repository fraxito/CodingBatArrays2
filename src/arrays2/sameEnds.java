/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;

/**
 *
 * @author xp
 */
public class sameEnds {
    
    public boolean sameEnds(int[] nums, int len) {
        if (nums [0] == nums[nums.length-1]){
            return true;
        }
        else if (nums [nums.length-2] == nums[1]){
            return true;
        }
        return false;
    }
}
