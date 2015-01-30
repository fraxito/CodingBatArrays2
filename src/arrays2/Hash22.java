

package arrays2;

/**
 *
 * @author Krotxe
 */
public class Hash22 {
    
            public boolean has22(int[] nums) {


 
/**
 * Éste método busca entre los componentes del array (desde el primero hasta el penúltimo) 
 * hasta que encuentra el número "2" y acto seguido comprueba si la siguiete posición también
 * contiene el mismo número. Si dichas condiciones se cumplen, el método devuelve "true",
 * en caso contrario devuelve "false".
 */
for (int i =0; i<(nums.length-1); i++)
{
   if ((nums[i]==2) && (nums[i+1]==2)){
    return true;
}

}
return false;
    }
}


