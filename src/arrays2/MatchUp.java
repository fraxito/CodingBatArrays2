/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;

/**
 *
 * @author robi
 */
public class MatchUp {

public int matchUp(int[] nums1, int[] nums2) {
  
  int sol = 0;
   
  for (int i = 0; i < nums1.length; i++) {
    int bb = Math.abs(nums1[i] - nums2[i]);
    if (bb <= 2 && bb > 0)
      sol++;
  }
  return sol;

}

}
