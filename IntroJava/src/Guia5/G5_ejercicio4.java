/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;
import java.util.Scanner;
/**
 *
 * @author Edu
 */
public class G5_ejercicio4 {

    /*
     Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. 
    La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        
        System.out.println("ingrese el tamaño de la matriz");
        Scanner n_i = new Scanner(System.in);
        int n = n_i.nextInt();
        
        //matriz
        int [][] matriz = new int [n][n];
        int [][] matriz_inv = new int [n][n];
        
        //relleno
        System.out.println("matriz");
        for (int i = 0; i < n; i++) {
            System.out.println(" ");
            for (int j = 0; j < n; j++) {
                matriz[i][j]= (int) (Math.random()*n)+1;
                
                System.out.print(" [ " + matriz[i][j] + " ]");
                System.out.print(" ");
            }
        }
        
        
        
        System.out.println("");
        System.out.print("matriz inverdida");
        for (int i = 0; i < n; i++) {
            System.out.println(" ");
            for (int j = 0; j < n; j++) {
                matriz_inv[i][j] = matriz[j][i];
                
                System.out.print(" [ "+ matriz_inv[i][j] + " ]");
                System.out.print(" ");
            }
            
        }
        
        
    }
    
}
