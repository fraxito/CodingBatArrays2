/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;

/**
 *
 * @author Pepe Zhu
 * 
 * Comentario general : Dado un conjunto no vacío de enteros, devolver 
 * una nueva matriz que contiene los elementos de la matriz original que vienen
 * después de la última 4 en la matriz original. La matriz original contendrá al
 * menos un 4. Nota que es válido en Java para crear una matriz de longitud 0.
 *
 */
public class Post4 {
    public int[] post4(int[] nums) {

//Indica el longitud total
int longitud = nums.length;

  
//Cuando el ultimo numero no sea 4,resta a longitud uno hasta
// que aparezca un 4.
while (nums[longitud-1] != 4){ longitud --;}

// El contador empieza desde 0 .
  int contador = 0;

// El resultado es  igual que los numero que vienen despues de la ultima 4.
  int  resultado [] = new int[nums.length-longitud];
 
 
  for (int i = longitud; i<nums.length; i++){
     resultado[ contador] = nums[i];
     contador++; 
  }
  return resultado;
  
}
    
}