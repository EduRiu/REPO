/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Main.Main;
import java.util.Arrays;

/**
 *
 * @author Edu
 */
public class ArraysServicios {

    //Main vectorA = new Main();

    public static void iniciarVector(int[] vectorA) {

        for (int i = 0; i < vectorA.length; i++) {

            vectorA[i] = (int) ((Math.random() + .1) * 1500);

        }

    }

    public static void mostarVector(int[] vectorA) {

        for (int i = 0; i < vectorA.length; i++) {
            System.out.print("[ " + vectorA[i] + " ]");
        }
        System.out.println(" ");
    }

    public static void ordenarVector(int[] vectorA) {

        int[] orden = new int[vectorA.length];

        for (int i = 0; i < vectorA.length; i++) {

            orden[i] = vectorA[i] * -1;

        }
             Arrays.sort(orden);
             
          for (int i = 0; i < vectorA.length; i++) {
            vectorA[i]=orden[i]*-1;
        }
           
    }

    public static void llenarVectorB(int[] vectorA, int[] vectorB) {

       
        System.arraycopy(vectorA, 0, vectorB, 0, 10);
        Arrays.fill(vectorB, 10, 20, (int) 0.5 );

        //Arrays.fill(vectorB, 5);
        //vectorB = Arrays.copyOf(vectorA, 10);
    }

    public static void mostrarVectores(int[] vectorA, int[] vectorB) {
        System.out.println("vector A");
        for (int i = 0; i < vectorA.length; i++) {
            System.out.print("[ " + vectorA[i] + " ]");
        }

        System.out.println("");

        
        System.out.println("vector B");
        for (int i = 0; i < vectorB.length; i++) {
            System.out.print("[ " + vectorB[i] + " ]");
        }
    }

}
