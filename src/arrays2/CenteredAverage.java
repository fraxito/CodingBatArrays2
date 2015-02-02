/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;
 

/**
 *
 * @author Yoel Cano Martinez.
 */
public class CenteredAverage {
public int centeredAverage(int[] nums) {

int sum = 0;
int numeroMayor = nums[0];
int numeroMenor = nums[0];

for (int i = 0; i < nums.length; i++){
   if (nums[i]>numeroMenor){
    numeroMenor = nums[i];
   }
   if (nums[i]<numeroMayor){
    numeroMayor = nums[i];
   }  

 
sum += nums[i] ;
}

 sum = sum - numeroMayor;
 sum = sum - numeroMenor; 
 
 int media = 0;
 media = sum/(nums.length - 2);
 return media; 
}
    
}
