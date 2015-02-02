/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;

/**
 *
 * @author Virtus
 */
public class TenRun {
    
    public int[] tenRun(int[] nums) {
  
  int aux = -1;
  
  for (int i=0; i<nums.length; i++){
   
     if (nums[i]% 10 == 0){
     aux = nums[i];
     
     }
     else if (aux != -1){
     nums[i]=aux;
     }
   }   
   return nums;
    
    }
}
