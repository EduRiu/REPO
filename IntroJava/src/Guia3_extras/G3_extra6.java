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
public class G3_extra6 {

    /*
     Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. 
     y el promedio de estaturas en general.
     */
    public static void main(String[] args) {
        
    
    /*planteo hacer un hacer mientras, con salida S/N*/
    boolean otro = true;
    int contador = 0;
    float contador1 = 0;
    float contadorG = 0;
    float promedio = 0;
    float promedio1 = 0;
    
    do
        {
            System.out.println("Ingrese una altura");
            Scanner scan = new Scanner(System.in);
            float  altura = scan.nextFloat();
            contadorG++;
           
          if (altura < 1.60)
          {
              contador1++;
              float suma1 = 0;
              suma1 = suma1 + altura;
              promedio1 = suma1/contador1;
              
          }
              else
          {
              contador++;
              float suma = 0;
              suma = suma + altura;
              promedio = suma/contador;
          }
           
            System.out.println("ingresas otra altura S/N");
            Scanner resp_i = new Scanner(System.in);
            String resp = resp_i.next();
            
            if ("s".equals(resp))
            {
                otro = true;
            }
          else
            {
                otro = false;
            }
          
          
          
        }  while (otro);
        
        System.out.println("Informe");
        System.out.println("se ingresaron un total de " + contadorG);
        System.out.println("Alturas menores a 1.60 " + contador1 + " con un promedio de " + promedio1 );
        System.out.println("el promedio total de las alturas ingresas es " + promedio + promedio1);
    }
    
}
