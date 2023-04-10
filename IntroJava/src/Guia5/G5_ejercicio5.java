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
public class G5_ejercicio5 {

    /*
    Realice un programa que compruebe si una matriz dada es antisimétrica. 
    Se dice que una matriz A es antisimétrica cuando ésta es igual 
    a su propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
    La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {

        System.out.println("Cargar la matriz");

        int[][] matriz = new int[3][3];
        int[][] matrizT = new int[3][3];
        int contador = 0;
        Scanner ingres_i = new Scanner(System.in);
//creo la matriz con datos ingresados
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int ingreso = ingres_i.nextInt();
                matriz[i][j] = ingreso;

            }

        }
        System.out.println(" ");

        
//muestro la matriz
        for (int i = 0; i < 3; i++) {
            System.out.println(" ");
            for (int j = 0; j < 3; j++) {
                 System.out.print(" [ " + matriz[i][j] + " ] ");
            }
            System.out.print(" ");
        }
        System.out.println(" ");
//muestro la matrizT
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                matrizT[i][j] = matriz[j][i];
                System.out.print(" [ " + matrizT[i][j] + " ] ");
            }
            System.out.print(" ");
        }
//corro un if, donde si la suma de elemento a elemento es 0 el contador tiene que girar
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] + matrizT[i][j] == 0) {
                    contador++;
                }
            }
        }

        if (contador != 0) {

            System.out.println("La matrices son transpuestas");
        } else {
            System.out.println("No son transpuestas");
        }

    }
}
