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
public class ejercicio6 {

    /*
    Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
    El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
    El programa deberá ejecutarse hasta que se elija la opción 5. 
    Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
    se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
    Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

     */
    public static void main(String[] args) {
        System.out.println("Ingrese un numero");
        Scanner num_i = new Scanner(System.in);
        int num1 = num_i.nextInt();
        System.out.println("Ingrese un segundo numero");
        int num2 = num_i.nextInt();
        boolean salir = true;
        
        do {
        System.out.println("Ingrese una operacion");
        System.out.println(">-----MENU-----<");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Salir");
        
        Scanner eleccion_i = new Scanner(System.in);
        int eleccion = eleccion_i.nextInt();
        
        
        
        
        switch(eleccion)
                {
            case 1:
                System.out.println("Seleccion . Suma");
                System.out.println(num1 + num2);
                break;
            case 2:
                 System.out.println("Seleccion . Resta");
                 System.out.println(num1 - num2);
                 break;
            case 3:
                System.out.println("Seleccion . Multiplicacion");
                System.out.println(num1 * num2);
                break;
            case 4: 
                System.out.println("Seleccion . Division");
                System.out.println(num1 / num2);
                 break;
                 
            case 5:
                System.out.println("Desea Salir ¿s/n?");
                Scanner resp_i = new Scanner(System.in);
                String resp = resp_i.nextLine();
                
                if ("s".equals(resp))
                {
                    salir =  false;
                }
                else
                {
                    salir =  true;
                }
                break;
                }
                } 
               
                while(salir); /*sale siempre que se pruebe el false*/
        
                
          }
    }
    

