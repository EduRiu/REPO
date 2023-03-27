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
public class ejercicio3 {
    /*
    Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.
    */
    
    public static void main(String[] args) {
        
        System.out.println("ingrese una frase");
        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine();
        
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        
        
        
    }
}
