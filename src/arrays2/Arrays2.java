package arrays2;

/**
 *
 * @author Jorge Cisneros
 */
public class Arrays2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Arrays2 prueba1 = new Arrays2();
        
        
        // TODO code application logic here
        int [] valor1 = {1,2,3,4,5,6,7,8};
        
        System.out.println(prueba1.countEvens(valor1));
    }
    
    /**
     * 
     * @param nums
     * @return 
     * 
     * El método countEvens cuenta cuantos números pares
     * hay en un array
     * El array puede ser de cualquier tamaño
     */
    public int countEvens(int[] nums) {
        int pares = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }
    
}
