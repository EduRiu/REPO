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
public class G3_extra10 {

    /*
    Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados aleatoriamente entre 0 y 10. 
    El programa debe indicar al usuario si su respuesta es o no correcta. 
    En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. 
    Para realizar este ejercicio investigue como utilizar la función Math.random() de Java
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese un numero");
        
        
        
        int ab, a, b, m;
        a = (int) (Math.random()*100);
        b = (int) (Math.random()*100);
        ab = a*b;
        
        boolean salir = true;
        
        do
        {
            Scanner num = new Scanner(System.in);
            m = num.nextInt();
            
            if (ab==m)
            {
                System.out.println("Ingresaste el mismo numero");
                System.out.println("Eres crack");
                salir=false;
                break;
            }
            else
            {
                System.out.println("Prueba con otro numero");
            }
            
            System.out.println("pista " + ab);
            
        } while(salir);
        
        
        
        
        
        
    }
    
}
