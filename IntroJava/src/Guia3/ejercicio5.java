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
public class ejercicio5 {

    /*
     Escriba un programa en el cual se ingrese un valor límite positivo, 
    y a continuación solicite números al usuario hasta que 
    la suma de los números introducidos supere el límite inicial.
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese el limite superior");
        Scanner limite_i = new Scanner(System.in);
        int limite = limite_i.nextInt();
        int suma = 0;
        int contador = 0;
        do
        {
         System.out.println("Ingrese numero");
         Scanner ingreso_i = new Scanner(System.in);
         int ingreso = ingreso_i.nextInt();
         contador++;
         suma = ingreso + suma;
           
            
        } while (limite > suma);
        System.out.println("luego de " + contador + " ingresos, el numero sumado es " + suma +
                " y el limite era " + limite);
        
        
        
        
        
        
        }
    
}
