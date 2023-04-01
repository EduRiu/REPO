/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class G4_ejercicio2 {

    /*
    Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de 
    las personas ingresadas por teclado e indique si son mayores o menores de edad.
    Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas 
    y frenar cuando el usuario ingrese la palabra “No”.

     */
    public static void main(String[] args) {
        
        Scanner nombre_i = new Scanner(System.in);
        Scanner edad_i = new Scanner(System.in);
        Scanner eleccion_i = new Scanner(System.in);
        Scanner seguir_i = new Scanner(System.in);
        
       
        String seguir;
        boolean eleccion = true;
        
       do
       {   
        System.out.println("Ingrese un nombre");
        String nombre = nombre_i.nextLine();
        
        System.out.println("Ingrese la edad");
        int edad = edad_i.nextInt();
                   
        Verifica(nombre, edad);
        
        System.out.println("Ingresa otro nombre s/n");
        seguir = seguir_i.nextLine();        
        
        if("No".equals(seguir))
        {
            eleccion = false;
        }
        else
        {
            eleccion = true;
        }
                
        
       }while(eleccion);
        
    }
        
    public static void Verifica(String nombre, int edad)
    {
        
        if (edad>=18)
                {
                    System.out.println( nombre + " tiene " + edad + " años y es mayor");
                }
                else
                {
                    System.out.println( nombre +  " tiene " + edad + " años y es menor");
                }
                   
    }
    
}
