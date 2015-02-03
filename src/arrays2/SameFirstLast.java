/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;

/**
 *
 * @author xp
 */
public class SameFirstLast {
    int[] num = {1, 2, 3};
    
    
    public boolean sameFirstLast(int[] nums) {
        boolean ok = false;
        
        if(nums.length >=1)
        {
            if(nums[0] == nums[nums.length-1])
            {
                ok = true;
            }
        
        }
        
        return ok;
    }

}
