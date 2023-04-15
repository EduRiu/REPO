/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7_extra_ej3;

import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class Clase_Juego_ej3 {

    /*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar
     */
    private int numero;

    public Clase_Juego_ej3() {
    }

    public Clase_Juego_ej3(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void IniciarJuego() {
        Scanner leer = new Scanner(System.in);

        //System.out.println("Jugador 1, elija un numero");
        //this.setNumero(leer.nextInt());
        int intentos = 5;
        
        int numero2;
        int contador = 0;
        
       
        boolean salir = false;
        String mensaje;
        int gano1 = 0;
        int gano2 = 0;

        do {
            System.out.println("Jugador 1, ingrese un numero");
            this.numero = leer.nextInt();

            System.out.println("COMIENZA EL JUEGO");
            contador = 0;
            
            do {
                System.out.println("Jugador 2, ingrese un numero");
                numero2 = leer.nextInt();

                if (numero == numero2) {
                    System.out.println("Jugador 2 GANO");
                    gano2++;
                    break;
                } else if (numero > numero2) {
                    System.out.println("El valor ingresado es menor");
                } else {
                    System.out.println("El valor ingresado es mayor");
                }

                contador++;
                if (contador == intentos) {
                    System.out.println("Jugador 1 GANO");
                    gano1++;
                    
                }
            } while (contador < 5);
            
            System.out.println("Desean jugar de nuevo S/N");
            mensaje = leer.next();
            if (mensaje.equals("S")) {
                salir = true;
            }
            else
            {
                salir = false;
            }
            
        } while (salir);

        String g1, g2;
        if (gano1>1) {
            g1 = "veces";
            }
        else
        {
            g1 = "vez";
        }
        
        if (gano2>1) {
            g2 = "veces";
            }
        else
        {
            g2 = "vez";
        }
        
        
        
        
        System.out.println("el jugador 1 gano " + gano1 + " " + g1);
        System.out.println("el jugador 2 gano " + gano2 + " " + g2);
    }
}
