
package arrays2;


public class FizzArray3 {
    
    public int[] fizzArray3(int start, int end) {
    int n = end - start;
    int[] result = new int[n];
 
    for (int i = 0; i < n; i++)
        result[i] = start++;
    return result;
    
}
    
}
