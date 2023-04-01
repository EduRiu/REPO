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
public class G3_extra7 {

    /*
    Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). 
    El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario. 
    Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese el modo de aplicar \n 1 - while \n 2 - do - while");
        Scanner eleccion_i = new Scanner(System.in);
        int eleccion = eleccion_i.nextInt();
        
        switch (eleccion){
            case 1:
                 System.out.println("ingrese numero de la muestra");
                 Scanner muestra_i = new Scanner(System.in);
                 int muestra = muestra_i.nextInt();
                 int contador = 0;
                 int max = 0;
                 int min = 0;
                 int promedio = 0;
                 int suma = 0;
                 int contvalida = 0;
                 boolean igual = true;
                
                 while (muestra > contador)
                 {
                     contador ++;
                     System.out.println("Ingrese un numero");
                     Scanner num_i = new Scanner(System.in);
                     int num = num_i.nextInt();
                     
                     if (igual == true)
                     {
                         max = num;
                         min = num;
                         igual = false;
                     }
                     if (num>max)
                     {
                         max = num;
                     }
                     
                   
                     
                     if (num<min)
                     {
                         min = num;
                     }
                     
                     if (num>0)
                     {
                     suma = num + suma;
                     promedio = suma/contador;
                     contvalida++;
                     }
                     
                     
                     
                 }
                 System.out.println("numero ingresados " + muestra);
                 System.out.println("la suma es de " + suma);
                 System.out.println("se sumaron para el promedio " + contvalida);
                 System.out.println("arrojando un promedio de " + promedio);
                 System.out.println("con un maximo de " + max + " y minimo de " + min);
                 break;
      
            case 2:
                System.out.println("ingrese numero de la muestra");
                 Scanner muestra2_i = new Scanner(System.in);
                 int muestra2 = muestra2_i.nextInt();
                 int contador2 = 0;
                 int max2 = 0;
                 int min2 = 0;
                 int promedio2 = 0;
                 int suma2 = 0;
                 int contvalida2 = 0;
                 boolean igual2 = true; 
                
                 do 
                     
                {
                     contador2 ++;
                     System.out.println("Ingrese un numero");
                     Scanner num_i = new Scanner(System.in);
                     int num = num_i.nextInt();
                     
                     if (igual2 == true)
                     {
                         max2 = num;
                         min2 = num;
                         igual2 = false;
                     }
                     if (num>max2)
                     {
                         max2 = num;
                     }
                     
                   
                     
                     if (num<min2)
                     {
                         min2 = num;
                     }
                     
                     if (num>0)
                     {
                     suma2 = num + suma2;
                     promedio2 = suma2/contador2;
                     contvalida2++;
                     }
                     
                } while (contador2<muestra2);
                 
                 System.out.println("numero ingresados " + muestra2);
                 System.out.println("la suma es de " + suma2);
                 System.out.println("se sumaron para el promedio " + contvalida2);
                 System.out.println("arrojando un promedio de " + promedio2);
                 System.out.println("con un maximo de " + max2 + " y minimo de " + min2);
                 
                 break; 
    
    }
 }
}