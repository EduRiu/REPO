/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class ejercicio1 {
    /*
    Crear un programa que dado un número determine si es par o impar.    
    */

    public static void main(String[] args) {
        
        System.out.println("ingrese un numero");
        Scanner num_i = new Scanner(System.in);
        int num = num_i.nextInt();
        
        if (num%2==0)
        {
             System.out.println("el numero es par");
        }
          else
        {
        System.out.println("el numero es impar");
        }

        
    }

}

