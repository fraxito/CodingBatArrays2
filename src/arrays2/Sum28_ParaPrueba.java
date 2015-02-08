/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;

/**
 *
 * @author alvaro
 */
public class Sum28_ParaPrueba {
    
    public boolean sum28(int[] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++)
        if (nums[i] == 2) sum += 2;
    return sum == 8;
}
    
}
