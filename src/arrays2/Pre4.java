
package arrays2;

/**
 *
 * @author Daniel Yubero
 */
public class Pre4 {
    
    public int[] pre4(int[] nums) {
        int contar = 0;
        for (int i = 0;( i < nums.length) && (nums[i] != 4); i++) {
             contar++;
        }
        int[] resultado = new int[contar];
        for (int i = 0; i < resultado.length; i++)
            resultado[i] = nums[i];
        return resultado;
      }
}


