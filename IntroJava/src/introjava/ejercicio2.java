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
public class ejercicio2 {
    
    public static void main(String[] args) {
        /*Escribir un programa que pida tu nombre, 
        lo guarde en una variable y lo muestre por pantalla.*/
        
        String nombre;
        System.out.println("Ingresa tu nombre");
        Scanner nombre_i = new Scanner(System.in);
        nombre = nombre_i.next();
        System.out.println("Tu nombre es " + nombre);
        
        int a, b, c;
        System.out.println("ingrese a");
        Scanner a_i = new Scanner(System.in);
        a = a_i.nextInt();
        System.out.println("ingrese b");
        Scanner b_i = new Scanner(System.in);
        b = b_i.nextInt();
        c = a % b;
        System.out.println(c);
        
        
    }
    
}
