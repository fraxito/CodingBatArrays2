/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;
 

/**
 *
 * @author xp
 */
public class CenteredAverage {
    public int centeredAverage(int[] nums) {
int sum = 0;
int numeroMayor = 0;
int numeroMenor = 0;


for (int i = 0; i < nums.length; i++){
   if (nums[i]>=numeroMayor){
    numeroMayor = nums[i];
   }
   if (nums[i]<=numeroMenor){
    numeroMenor = nums[i];
   }
   
}
 
for (int j = 0; j < nums.length; j++){
   sum = sum + nums[j];
}
 sum = sum - numeroMayor - numeroMenor; 
       
 return sum/(nums.length-2); 
}
    
}
