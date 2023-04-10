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
public class G5_ejercicio6 {

    /*
    Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, 
    sus columnas y sus diagonales son idénticas. 
    Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
    El programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        System.out.println("ingrese numeros para formar una matriz");
        Scanner ingreso_i = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int[][] matrizI = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                int aux = 0;

                do {

                    aux = ingreso_i.nextInt();
                    matriz[i][j] = aux;
                    System.out.println("cargar numero");

                } while (aux > 9 || aux <= 0); //14  

                System.out.println("numero correcto");

            }
        }

        int sumafila0 = 0;
        int sumafila1 = 0;
        int sumafila2 = 0;
        int sumadia = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("");
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sumadia += matriz[i][j];

                }
                System.out.print(" [ " + matriz[i][j] + " ] ");
            }
            System.out.println("");
        }

        for (int[] fila_n : matriz) {
            {
                sumafila0 = sumafila0 + fila_n[0];
                sumafila1 = sumafila1 + fila_n[1];
                sumafila2 = sumafila2 + fila_n[2];

            }
        }

        System.out.println("la suma de las filas es: ");
        System.out.print(sumafila0 + " - ");
        System.out.print(sumafila1 + " - ");
        System.out.print(sumafila2 + " - ");
        System.out.println(sumadia);

        int sumafilaI0 = 0;
        int sumafilaI1 = 0;
        int sumafilaI2 = 0;
        int sumadiaI = 0;

        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                matrizI[2 - i][j] = matriz[i][j];

            }

        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sumadiaI += matrizI[i][j];
                }
            }
        }

        for (int j = 0; j < 3; j++) {
            System.out.print("");
            for (int k = 0; k < 3; k++) {
                System.out.print(" [ " + matrizI[j][k] + " ] ");
            }
            System.out.println("");
        }

        for (int[] fila_ni : matrizI) {
            sumafilaI0 += fila_ni[0];
            sumafilaI1 += fila_ni[1];
            sumafilaI2 += fila_ni[2];

        }
        System.out.print(sumafilaI0 + " - ");
        System.out.print(sumafilaI1 + " - ");
        System.out.print(sumafilaI2 + " - ");
        System.out.print(sumadiaI);

        System.out.println("");

        boolean prueba = false;

        if (sumafila0 == sumafilaI0 && sumafila1 == sumafilaI1 && sumafila2 == sumafilaI2 && sumadia == sumadiaI) {
            prueba = true;
        }

        System.out.println(" la matriz es " + prueba);

    }
}
