/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;

/**
 *
 * @author Gesus
 */
public class TwoTwo {

public boolean twoTwo(int[] nums) {
 //Mientras que i sea menor que la longitud del array....
for (int i=0; i<(nums.length); i++)
{
  //si i es igual a 2....
if(nums[i]==2)
{
 //comprueba la siguiente posicion....
i++;
//y si la longitud de i no es menor que la del array o bien no sea 2,devuelve falso.
if(!(i<(nums.length)) || nums[i] !=2)
    return false;
//Mientras que i sea  igual a 2,devuelve verdadero.
while(i<nums.length && nums[i] ==2) i++;
}
}
return true;
}
}