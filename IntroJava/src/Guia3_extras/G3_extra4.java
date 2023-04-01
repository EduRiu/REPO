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
public class G3_extra4 {

    /*
     Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
     */
    public static void main(String[] args) {
        
        
        System.out.println("Ingrese un numero");
        Scanner num_i = new Scanner(System.in);
        int num = num_i.nextInt();
        
        
        switch (num)
        {
            case 1:
                System.out.println("el equivalente de " + num + "es I");
                break;
            case 2:
                System.out.println("el equivalente de " + num + "es II");
                break;
            case 3:
                System.out.println("el equivalente de " + num + "es III");
                break;
            case 4:
                System.out.println("el equivalente de " + num + "es IV");
                break;
            case 5:
                System.out.println("el equivalente de " + num + "es V");
                break;
            case 6:
                System.out.println("el equivalente de " + num + "es VI");
                break;
            case 7:
                System.out.println("el equivalente de " + num + "es VII");
                break;
            case 8:
                System.out.println("el equivalente de " + num + "es VIII");
                break;
            case 9:
                System.out.println("el equivalente de " + num + "es IX");
                break;
            case 10:
                System.out.println("el equivalente de " + num + "es X");
                break;
            default:
                System.out.println("No ingresaste un numero entre 1 y 10");
              
            
            
        }
            
        
        
        
    }
    
}
