/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;

/**
 *
 * @author Jorge
 */
public class BigDiff {

    public int bigDiff(int[] nums) {
        //Numero minimo
        int numMinimo1 = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int numMinimo2 = nums[i];
            numMinimo1 = Math.min(numMinimo1, numMinimo2);
        }
        
        //Numero maximo
        int numMaximo1 = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int numMaximo2 = nums[i];
            numMaximo1 = Math.max(numMaximo1, numMaximo2);
        }
        
        int total = numMaximo1 - numMinimo1;
        return total;
    }

    
}
