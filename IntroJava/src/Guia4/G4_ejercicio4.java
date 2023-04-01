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
public class G4_ejercicio4 {

    /*
    Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro para que nos 
    indique si es o no un número primo, debe devolver true si es primo, sino false.
    Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, 
    ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
    */
 
    public static void main(String[] args) {
    
        System.out.println("Ingrese un numero");
        Scanner num_i = new Scanner(System.in);
        int num = num_i.nextInt();
        
        boolean retorno = primo(num);
        
        System.out.println("Es " + retorno + " que el numero " + num + " es primo");
        
    }
    
    //aca armo la funcion, tiene que retonar una TRUE o FALSE
    
    public static boolean primo(int num)   {
   
    int contador = 0;
    int contador1 = 0;
    int contador2 = 0;
    boolean valida;
    int a;
    
        for (int i = 1; i <= num; i++)  {
            
               
                
            if (num%i == 0)            {
                contador++; 
            }
          
            
            
        }
        
        // contador = contador1 + contador2;
        
        if(contador == 2)
        {
            valida = true;
        }
        else
        {
            valida = false;
        }
        
        return valida;
    }
   
}
