/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class ejercicio4 {
    /*
    Dada una cantidad de grados centígrados se debe mostrar 
    su equivalente en grados Fahrenheit. 
    La fórmula correspondiente es: F = 32 + (9 * C / 5).
    */

    public static void main(String[] args) {
            System.out.println("Ingrese una temperatuca en CELSIUS");
            Scanner tempC = new Scanner(System.in);
            double tempF = tempC.nextDouble();
            
            
            System.out.println(32 + (9*tempF)/5);
            
                    
    }
 
}

