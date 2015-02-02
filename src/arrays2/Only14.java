/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;

/**
 *
 * @author Guillermo F
 */
public class Only14 {
    
    
     public boolean only14(int[] nums) {
        int i;
      
       for (i = 0; i < nums.length; i ++) 
        if (nums[i] != 1 && nums[i] != 4){
            return false;
        
       }
        return true;
    }
    //fdf
}
