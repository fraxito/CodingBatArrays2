/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;

/**
 *
 * @author Cristina
 */
public class Sum67 {
    public int sum67(int[] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 6) sum += nums[i];
        else
            while (nums[i] != 7) i++;
    }
    return sum;
}
}