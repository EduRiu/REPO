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
public class G4_ejercicio3 {

    /*
    Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, 
    estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y
    la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
    El cambio de divisas es:
    * 0.86 libras es un 1 €
    * 1.28611 $ es un 1 €
    * 129.852 yenes es un 1 €

     
     */
    public static void main(String[] args) {
        
        Scanner euro_i = new Scanner(System.in);
        Scanner moneda_i = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de euros a convetir");
        double euro = euro_i.nextDouble();
        
        System.out.println("a que moneda lo quiere convertir?");
        String moneda = moneda_i.nextLine();
        
        switch(moneda)
        {
            case "dolares":
                Dolares(euro,moneda);
                break;
            case "libras":
                Libras(euro, moneda);
                break;
            case "yen":
                Yen(euro,moneda);
                break;
            default:
                System.out.println("No ingresaste una opcion valida");
        }
        
        
    }
    
    public static void Dolares(double euro, String moneda)
    {
        System.out.println("el cambio para " + euro + " es " + (1.28611*euro) + " " + moneda);
    }
    
    public static void Libras(double euro, String moneda)
    {
        System.out.println("el cambio para " + euro + " es " + (0.861*euro) + " " + moneda);
    }
   public static void Yen(double euro, String moneda)
    {
        System.out.println("el cambio para " + euro + " es " + (129.852*euro) + " " + moneda);
    }
    
}
