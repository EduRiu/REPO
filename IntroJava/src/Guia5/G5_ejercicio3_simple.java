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
public class G5_ejercicio3_simple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n_i = new Scanner(System.in);
        
        int [] vector = new int [10];
        int n = 10;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        
        
        for (int i = 0; i < n; i++) {
            switch  ( (int) Math.log10(vector[i]) + 1) {
                case 1 :
                    ++count1;
                    break;
                case 2 :
                    ++count2;
                    break;
                case 3 :
                    ++count3;
                    break;                
                case 4 : 
                    ++count4;
                    break;
                case 5 :
                    ++count5;
                    break;
                default:
                        {};
    }
  }
 }
}
