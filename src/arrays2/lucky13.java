/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;

/**
 *
 * @author Gonzalo de las Heras
 */
public class lucky13 {

    public boolean lucky13(int[] nums) {
        boolean uno = false;
        boolean tres = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                uno = true;
            }
            if (nums[i] == 3) {
                tres = true;
            }
        }
        return uno == false && tres == false;      
    }

}
