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
public class ejercicio8 {

    /*
    Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, 
    si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
                            * * * *
                            *     *
                            *     *
                            * * * *
  
     */
    
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese la cantidad de lados");
        Scanner lado_i = new Scanner(System.in);
        int lado = lado_i.nextInt();
        
        
        for (int i=1; i<=lado; i++)/* como en PSEINT se trabaja con matriz--- */
        {
            for (int j=1; j<=lado; j++)
            {
                if (i==1 || i==lado || j==1 || j==lado)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            
            }
            System.out.println("");
        }
        
        
        
    }
    
}
