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
public class G5_ejercicio3 {

    /*
     Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
    cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     */
    public static void main(String[] args) {
        System.out.println("ingrse el tamaño de elementos del vector");
        Scanner n_i = new Scanner(System.in);
        int n = n_i.nextInt();
        int a;
        int[] vector = new int[n];
        int e = 1000;
        int contador;
        int r;
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;

        for (int i = 0; i < n; i++) {

            a = (int) (Math.random() * e) + 1; //genero el vector
            vector[i] = a;
            
            System.out.println(a);
            
            contador = 0;                       //es conveniente poner el contador en cero aca para que empiece el do-while en 0
            
            do {

                r = vector[i] / 10;
                vector[i] = r;
                contador++;

            } while (r > 0);

            System.out.println("contador" + contador);
            
            switch (contador) {
                case 1:
                    contador1++;
                    break;
                case 2:
                    contador2++;
                    break;
                case 3:
                    contador3++;
                    break;
                case 4:
                    contador4++;
                    break;
                case 5:
                    contador5++;
                    break;
                default:

            }
        }

        System.out.println("luego encontramos");
        System.out.println("1 digito " + contador1);
        System.out.println("2 digitos " + contador2);
        System.out.println("3 digitos " + contador3);
        System.out.println("4 digitos " + contador4);
        System.out.println("5 digitos " + contador5);

    }

}
/* tengo que hacer un truc
                                                entonces tendria que ir pasando el cada elemento del vector
                                                dividir por 10 hasta que a menor igual que 0
                                                cuanto las vueltas por y despues meter todo en un switch
                                                que en casa case que entre del 1 al 5.... me sume una vuelta
                                                al final tendre... contador ... contador1, contador2, contador3...

 */
