/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

/**
 *
 * @author Edu
 */
public class G5_ejercicio1 {

    /*
     Realizar un algoritmo que llene un vector con los 100 primeros números enteros 
     y los muestre por pantalla en orden descendente.
     */
    public static void main(String[] args) {
     
        System.out.println("Vamos generar un vector con 100 numeros y se "
                + "muestran en forma descendete"); 
        
        int [] vector = new int[101];
        
        for (int i = 100; i > 0; i--) 
         {
            vector[i] = i;
            System.out.print(vector[i] + " - ");
            
        }
        System.out.println(" ");
       
       
        
        for (int z : vector)
        {
            System.out.print(z + " / ");
        }
    }
    
}
