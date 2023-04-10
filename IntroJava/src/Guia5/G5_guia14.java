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
public class G5_guia14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] vector = new String[3]; // Le ponemos la dimension al vector

        // Puedo asignar valores de esta manera
        //vector[0] = 3;

        // Asigno valores mediante el for
        for (int i = 0; i <= 2; i++) {
            System.out.println("Ingrese nombre");
            String nombre = leer.next();
            vector[i] = nombre;

        }

        // Muestro el vector
        for (int i = 0; i <= 2; i++) {
            System.out.println("[" + vector[i] + "]");
        }

    }
}