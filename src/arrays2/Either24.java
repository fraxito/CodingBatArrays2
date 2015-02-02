/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;

/**
 *
 * @author MARCOS
 */
public class Either24 {
    public boolean either24(int[] nums) {
  int dobleDos = 0;
  int dobleCuatro = 0;
   
   for (int i=0; i< nums.length-1; i++){
       if ((nums[i] == 2) && (nums[i+1]==2))
       dobleDos++ ;
       if ((nums[i] == 4) && (nums[i+1]==4))
       dobleCuatro++ ;
    }
    if ((dobleDos != 0)&&(dobleCuatro != 0))
    return false;
    
    if ((dobleDos != 0) || (dobleCuatro != 0))
    return true;
    
    else{
    return false;
    }
    
    }
  
    
}
