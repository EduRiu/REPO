/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3_extras;

import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class G3_extra3 {

    /*
     Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
     Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese una letra");
        Scanner letra_i = new Scanner(System.in);
        String letra = letra_i.nextLine();
        
        letra = letra.toUpperCase();
        
        if ("A".equals(letra) || "E".equals(letra) || "I".equals(letra) || "O".equals(letra) || "U".equals(letra))
        {
            System.out.println("Ingresaste una vocal");
            
        }
         else
        {
            System.out.println("No es vocal");
        }
         
        
        
        
    }
    
}
