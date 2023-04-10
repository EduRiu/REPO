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
public class G4_ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        System.out.print("Numero: ");
        int num = leer.nextInt();
        
        System.out.println("¿El numero es primo?: " + primos(num));
    }
    public static String primos(int num) {
        int contador = 0;
        String respuesta;
        
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                contador++;
            }
        }
        if (contador > 1) {
            respuesta = "No";
        } else {
            respuesta = "Si";
        }
        return respuesta;
    }
    
    
}
    
