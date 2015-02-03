/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;

/**
 *
 * @author xp
 */
public class No14 {
    public boolean no14(int[] nums) {
       
       for(int i = 0; i<nums.length; i++){
           for(int j = 0; j<nums.length; j++){
               if(nums[i] == 1 && nums[j] == 4){
                   return false;
               }
           }
       }
       return true;
   }
}
