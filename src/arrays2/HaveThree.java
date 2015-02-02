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
public class HaveThree {
        public  void main(String[] args) {
            int[] nums = {3, 4, 3, 3, 4};
            
       haveThree(nums);

    }

  
public boolean haveThree(int[] nums) {
    
    int  numeroPos = nums.length ;
    int  numero3 = 0 ;
            
       
    
    if(nums.length > 2){
    
    for (int i = 0; i < numeroPos ; i++){
    
    if (nums [i] == 3) {
    
        numero3 ++;
        i++;
    }   
    }    
        
    
    }
    if (numero3 == 3){
     
        return true;
    
    }else    return false;
 

 
 
  
}
     
}
