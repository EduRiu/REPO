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
public class G3_extra1 {

    /*
    Dado un tiempo en minutos, calcular su equivalente en días y horas. 
    Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe 
    calcular su equivalente: 1 día, 2 horas.
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrse minutos");
        Scanner scan = new Scanner(System.in);
        int tiempo = scan.nextInt();
        
        
        int dias = tiempo / 1440;
        int hora = (tiempo % 1440)/60;
        int min = (tiempo % 1440)%60;
        
        System.out.println("El tiempo ingresado es \n " + 
                dias + " dias " + hora + " horas " + min + " minutos");
        
        
    }
    
}
