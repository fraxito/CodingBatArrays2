/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;

/**
 *
 * @author Admin
 */
public class Has12_DJ {
  public boolean has12(int[] nums) {
    boolean buscaUno= false;
  boolean buscaDos = false;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 1)
      buscaUno = true;
    if (nums[i] == 2 && buscaUno)
      buscaDos = true;
  }
  return buscaDos;
}
  
}
