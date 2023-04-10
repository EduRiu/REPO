/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5_extras;

import java.util.Scanner;
/**
 *
 * @author Edu
 */
public class G5_extra2 {

    /*
     Escriba un programa que averigüe si dos vectores de N enteros son iguales 
    (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
     */
    public static void main(String[] args) {
        
        System.out.println("ingrese los tamaños de los vectores");
        Scanner ingreso = new Scanner(System.in);
        int largo = ingreso.nextInt();
        
        int [] vector_1 = new int [largo];
        int [] vector_2 = new int [largo];
        
        
        cargarvector(vector_1, vector_2, ingreso);
        mostrarvector(vector_1, vector_2);
        compararvector(vector_1, vector_2);
        
       
        
    }
    //en este me traigo el scanner
    public static void cargarvector(int [] vector_1, int [] vector_2, Scanner ingreso)
        {
            System.out.println("generar el primer vector");
            for (int i = 0; i < vector_1.length; i++) {
                vector_1[i]=ingreso.nextInt();
            }
            
            System.out.println("generar el segundo vector");
            for (int i = 0; i < vector_2.length; i++) {
                //vector_2[i]= (int) (Math.random()*10);
                vector_2[i]= ingreso.nextInt();
            }
        }

    //esta me muestra los vectores
    public static void mostrarvector (int [] vector_1, int [] vector_2){
        System.out.println("primer vector");
        for(int elementos1 : vector_1){
            System.out.print(elementos1);
        }
        System.out.println(" ");
        System.out.println("segundo vector");
        for(int elementos2 : vector_2){
            System.out.print(elementos2);
           
        }
         System.out.println(" ");
    }
    
    //comparo elemento a elemento
    public static void compararvector (int [] vector_1, int [] vector_2){
       int contador = 0;
       int a = 0;
        
        for (int i = 0; i < vector_1.length; i++) {
            a = i;
            contador++;
            
            if (vector_1 [i] != vector_2 [i]) 
            {
                 break;             
            }
             
        }
        System.out.println("se detuvo la compararcion en la vuelta " + contador + " porque el elemento " +  a + " no es igual" );
    }

}



