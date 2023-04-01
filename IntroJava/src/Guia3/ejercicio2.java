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
public class ejercicio2 {

    /*
     Crear un programa que pida una frase y si esa frase es igual a “eureka” el 
     programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
     Nota: investigar la función equals() en Java.
     */
    
    public static void main(String[] args) {
        
        
        System.out.println("ingrese una palabra");
        Scanner frase_i = new Scanner(System.in);
        String frase = frase_i.nextLine();
        
        if ("eureka".equals(frase))
        {
             System.out.println("Correcto");            
        }
        else
        {
            System.out.println("Incorrecto");            
        }
        
    }
    
}
