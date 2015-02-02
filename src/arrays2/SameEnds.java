/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;

/**
 *
 * @author xp
 */
public class SameEnds {
    
    public boolean sameEnds(int[] nums, int len) {
         int auxiliar = 0;
         int contador = len;
         if (len == 0){
            return true;
         }
        for (int i=0; i<len; i++){
            if (nums [i] == nums[nums.length-contador]){
                auxiliar++;
                contador = contador-1;
            }
        }
        if (auxiliar == len){
            return true;
        }
        else{   
            return false;
        }
    }    
}

