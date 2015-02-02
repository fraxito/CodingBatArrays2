
package arrays2;

/**
 *
 * @author sote
 */
public class ShiftLeft {
    public int[] shiftLeft(int[] nums) {
         int retorno1[]= new int [nums.length];
    for(int i=0;i< nums.length-1;i++){
         int numero = 1;
         retorno1[i] = nums[nums.length-numero];
         numero++; 
    }
        return retorno1;   
    }
}
