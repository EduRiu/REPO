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
public class G3_extra9 {

    /*
Simular la división usando solamente restas. Dados dos números enteros mayores que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.

     */
    
    public static void main(String[] args) {
        
        System.out.println("ingres un valor");
        Scanner num_i = new Scanner(System.in);
        int num1 = num_i.nextInt();
        System.out.println("ingres otro valor");
        int num2 = num_i.nextInt();
        boolean salida = true;
        int num3;
        
        if (num1<num2)
        {
            System.out.println("ingrese  el valor uno nuevamente ");
            num1 = num_i.nextInt();
        }
        
        if (num2 == 0)
        {
            System.out.println("ingrese  el valor uno nuevamente ");
            num2 = num_i.nextInt();
        }
        
        do
        {
            num3=num1-num2;
            num1=num3;
            
             if(num2>num3)
             {
                 salida = false;
                
             }
             
             if (num3>num2 && num3>0)
             {
             System.out.println("num1 " + num1 + " - num 2 " + num2 + " = " + num3 );
             }
            /* if (num2<num3)
             {
                 System.out.println("num1 " + num1 + " - num 2 " + num2 + " = " + num3 );
             }
            */        
                  
             
            
        }while (salida);
        
        
    }
    
}
