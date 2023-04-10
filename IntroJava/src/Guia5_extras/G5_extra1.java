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
public class G5_extra1 {

    /*
    Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N,
    con los valores ingresados por el usuario.
     */
    
    public static void main(String[] args) {
        System.out.println("ingrese la cantidad de numeros a sumar");
        Scanner largo_i = new Scanner(System.in);
        int largo = largo_i.nextInt();
        
        
        System.out.println("la suma de los " + largo + " numeros es " + sumarNum(largo));
        
    }
    

 
        public static int sumarNum(int largo)
        {
        int suma = 0;
        int contador = 0;
            Scanner num_i = new Scanner(System.in);
        do
        {
            System.out.println("ingrese los numeros que quiera sumar");
            int ingreso = num_i.nextInt();
            suma += ingreso;
            contador ++;        
        }while(contador < largo); //se tiene que cumplir el verdadero para que el do siga corriendo
        
        return suma;
}

}