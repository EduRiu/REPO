/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

import java.util.Scanner;

/**Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
 *restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
 *matemática y deben devolver sus resultados para imprimirlos en el main. 

 *
 *
 */
public class G4_ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner lector= new Scanner(System.in);
         
    int num1,num2;
    int opcion;
         
    do{     
        System.out.println("Ingrese dos numeros: ");
        num1= lector.nextInt();
        num2= lector.nextInt();
       
        System.out.println("Seleccione una opcion: ");
        System.out.println("1. Sumar ");
        System.out.println("2. Restar ");
        System.out.println("3. Multiplicar ");
        System.out.println("4. Dividir ");
        System.out.println("5. Salir ");

        opcion= lector.nextInt();
        
        
    switch(opcion){ 
        
        case 1:
            System.out.println("El resultado de la suma es: "+ sumar(num1,num2));
        break;
        
        case 2:
            System.out.println("El resultado de la resta es: "+ resta(num1,num2));
        break;
        
        case 3:
            System.out.println("El resultado de la multiplicacion es: "+ multiplicar(num1,num2));
        break;
        case 4:
            System.out.println("El resultado de la division es: "+ dividir(num1,num2));
        break;
       
        case 5:
            System.out.println("Saliendo del programa...");
        
        default:
            System.out.println("Opcion invalida.Intente nuevamente. ");
         break;
         
        
    }
    
} while(opcion!=5);
    
    }
 
public static int sumar(int num1, int num2){
    int suma= num1+num2;
    
    return suma;
} 
public static int resta(int num1, int num2){
    int rest= num1-num2;
    
    return rest;
} 
 
    

public static int multiplicar(int num1, int num2){
    int mul= num1*num2;    
    return mul;
}
public static double dividir(int num1, int num2){
    double div= num1/num2;
    return div;
    
}
}