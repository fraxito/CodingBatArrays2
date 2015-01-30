/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;

/**
 *
 * @author Sergio
 */
public class Has77 {
     
    public boolean has77(int[] nums) {
        for (int i=0; i < nums.length - 1; i++){
            if (nums[i] == 7 && nums[i + 1] == 7){
            return true;
            }
        }
        for (int x=0; x < nums.length - 2; x++){
            if (nums[x] == 7 && nums[x + 2] == 7){
            return true;
            }
        }
        return false;
        
    }
}
