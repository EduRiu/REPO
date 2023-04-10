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
public class G5_extra3 {

    /*
     Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
     Después haremos otra función o procedimiento que imprima el vector.
     */
    public static void main(String[] args) {

        System.out.println("ingrese el tamaño del vector");
        Scanner ingreso = new Scanner(System.in);
        int largo = ingreso.nextInt();

        int[] vector = new int[largo];

        rellenavector(vector, largo);
        mostrarvector(vector);

    }

    public static void rellenavector(int[] vector, int largo) {

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
    }

    public static void mostrarvector(int[] vector) {
        for (int elementos : vector) {

            System.out.print("{ " + elementos + " }");

        }
        System.out.println("");
    }

}
