/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;

/**
 *
 * @author Gesus
 */
public class TwoTwo {

public boolean twoTwo(int[] nums) {
 for (int y = 0; y < nums.length; y++){
if ((nums[y] == 2) && (y + 1 == 2)){
 
 return true;

}
 }
return false;

}
}