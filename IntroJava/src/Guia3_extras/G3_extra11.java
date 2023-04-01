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
public class G3_extra11 {

    /*
     Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. 
    Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. 
    Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. 
    Nota: recordar que las variables de tipo entero truncan los números o resultados.
     */
    public static void main(String[] args) {
        System.out.println("ingrese un numero");
        Scanner num_i = new Scanner(System.in);
        int num = num_i.nextInt();
        int resto;
        int contador = 0;
        
        do
        {
            resto = num/10;
            num=resto;
            contador++;
            
        }while(resto>0);
            
        System.out.println("el numero tiene " + contador + " digitos");
        
        
        
        
        
        
    }
    
}
