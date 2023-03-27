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
public class ejercicio5 {
    /*
    Escribir un programa que lea un número entero por teclado 
    y muestre por pantalla el doble, el triple y 
    la raíz cuadrada de ese número. 
    */
    
    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero");
        Scanner num_i = new Scanner(System.in);
        double num = num_i.nextDouble();
        
        System.out.println("el doble del " + num + " es " + num*2);
        System.out.println("el triple del " + num + " es " + num*3);
        System.out.println("la raiz es " + Math.sqrt(num));
        
    }
    
}
