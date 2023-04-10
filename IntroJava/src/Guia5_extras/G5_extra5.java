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
public class G5_extra5 {

    /*
    Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios
    y muestre la suma de sus elementos.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("cuantas filas tiene la matriz?");
        int n = leer.nextInt();
        System.out.println("cuantas columnas tiene la matriz?");
        int m = leer.nextInt();
        
        int [][] matriz = new int [n][m];
        
        
        rellenarmatriz(matriz, n, m);
        mostrarmatriz(matriz, n, m);
        int retorno = sumaelementos(matriz, n, m);
       
        System.out.println("la suma de sus elementos es " + retorno);
        
    }
    
    public static void rellenarmatriz(int [][] matriz, int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j]= (int) (Math.random()*10);
            }
         }
      }
    public static void mostrarmatriz(int [][] matriz, int n, int m){
        for (int i = 0; i < n; i++) {
            System.out.print("");
            for (int j = 0; j < m; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
    public static int sumaelementos(int [][] matriz, int n, int m)
    {
        int suma = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma += matriz[i][j];
                
            }
        }
            return suma;
    }
}
