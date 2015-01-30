/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;

/**
 *
 * @author Javier Fernandez-Trapa
 */

public class FizzArray2 {
   
    public String[] fizzArray2(int n) {
       String[] array= new String[n];
       for(int i=0;i<n;i++){
            array[i]=String.valueOf(i);
       }
        
       return array;
    }
}
 

