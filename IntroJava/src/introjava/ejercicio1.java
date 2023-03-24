/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*Escribir un programa que pida dos números enteros 
      por teclado y calcule la suma de los dos. El programa deberá 
      después mostrar el resultado de la suma */
     
      int num1, num2;
      System.out.println("Ingrese un numero");
      Scanner num1_i = new Scanner(System.in);
      num1 = num1_i.nextInt();
      System.out.println("Ingrese otro numero");
      Scanner num2_i = new Scanner(System.in);
      num2 = num2_i.nextInt();
      System.out.println("La suma de los numeros es " + (num1+num2));
      
      
    }
    
}
