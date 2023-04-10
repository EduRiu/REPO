/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class G5_ejercicio2 {

    /**
     * Realizar un algoritmo que llene un vector de tamaño N con valores
     * aleatorios y le pida al usuario un número a buscar en el vector. El
     * programa mostrará dónde se encuentra el numero y si se encuentra repetido
     */
    public static void main(String[] args) {

        System.out.println("Ingrese un tamaño para el vector");
        Scanner n_i = new Scanner(System.in);
        int n = n_i.nextInt();
        int a;
        int[] vector = new int[n];
        int contador = 0;
        String aux = "";
        String repetido = "";
        for (int i = 0; i < n; i++) {

            a = (int) (Math.random() * n) + 1;
            vector[i] = a;
            System.out.println("pos " + i + " numero " + a);
        }

        System.out.println("ingrese un valor a busar dentro del vector");
        Scanner buscar_i = new Scanner(System.in);
        int buscar = buscar_i.nextInt();

        for (int i = 0; i < n; i++) {
            if (vector[i] == buscar) {
                aux = aux + "  " + i;
                contador++;
            }

            if (contador >= 1) {
                repetido = "Si";

            } else {
                repetido = "NO";
            }

        }
        System.out.println("el numero " + repetido + "  se encuentra repetido ");
        System.out.println("posicion " + aux);
    }

}
