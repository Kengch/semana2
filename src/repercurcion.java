/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kengc
 */
public class repercurcion {
    
    static int arr []={12,34,64,2,3};
    
    //El metodo recursivo debe tener minimo una condicion de parada/base
    //que nos permita devolver un valor o una llamada a si misma.
    
    public static int factorial(int n){
        if (n == 0) {
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    
    public static int encontrarMax(int[] numeros, int indice, int max){
        if (indice != numeros.length) {
            if (numeros[indice]>max) {
                max = encontrarMax(numeros, indice +1, numeros[indice]);
            }
            else{
            max = encontrarMax(numeros, indice +1, max);
            }
        }
        return max;
    }
}
