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
public class Sum28 {
   public boolean sum28(int[] nums) {
       int contador = 0;
       for (int i = 0;i < nums.length;i++){
           if(nums[i] == 2){
               contador = contador + 2;
           }
       }
       if(contador == 8){
           return true;
       }
       else{ 
           return false;
       }
}
    
    
}
