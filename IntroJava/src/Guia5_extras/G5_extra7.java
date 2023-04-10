/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5_extras;

import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class G5_extra7 {

    /*
    Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci. 
    Recordar que la sucesión de Fibonacci es la sucesión de los siguientes números:
    suma - 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
    elemento - 1, 2, 3, 4, 5, 6, 7, 8, 9,....
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el termino que desea averiguar");
        int fin = leer.nextInt();
        int[] vector = new int[fin];

        hacersuma(vector, fin);

    }

    public static void hacersuma(int[] vector, int fin) {
        int a, b, suma, contador;
        contador = 1;

        if (fin == 1) {
            a = 0;
            b = 1;
            suma = a + b;
        } else {
            a = 0;
            b = 1;
            suma = a + b;
            do {

             suma = a + b;
             a = b;
             b = suma;
             
             contador++;
                
            } while (fin>contador);
        }
       
        System.out.println("el elemento " + fin + " de la sucesion es " + suma);
        

    }

}
