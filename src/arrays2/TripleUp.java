/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;

/**
 *
 * @author Manuel Sánchez - Beato Baquero
 */
public class TripleUp {
   
    public boolean tripleUp(int[] nums) {
        
        boolean result = false;
        
        
  for (int i =0;i < nums.length-2;i++)
  if ( (nums[i] + 1 == nums[i+1]) && (nums[i+1] + 1 == nums[i+2]) )
  result = true;
  return result;
}
    
}
