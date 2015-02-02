/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;

/**
 *
 * @author luisfeliz
 */
public class fizzArray {
    

public int[] fizzArray(int n) {
    int[] resultado = new int[n];
    for (int i = 0; i < n; i++)
        resultado[i] = i;
    return resultado;
}
}
