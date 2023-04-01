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
public class Guia4_ML_ej12 {

    /*
    Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
    validando que el primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo, sino informe que no lo so
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese un numero");
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        int num2 = num.nextInt();
        
        
        Multiplo (num1,num2);
        
        
        
    }
    
    
    public static void Multiplo(int num1, int num2)
    {
        if (num1% num2 == 0) {
            
            System.out.println("El " + num1 + " es multiplo de " + num2);
            
        } 
        else 
        {
         
            System.out.println("El " + num1 + " no es multiplo de " + num2);
        }
    }
    
}

