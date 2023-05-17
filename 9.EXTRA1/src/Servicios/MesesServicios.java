/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Meses;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class MesesServicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void juegoNuevo(Meses juego) {

        int min = 0;
        int max = 12;

        Random valor = new Random();

        int mesSecreto = valor.nextInt(min + max);

        juego.setMesSecreto(juego.getMes()[mesSecreto]);

        System.out.println(juego.getMesSecreto());

        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
        do {
            String eleccion = leer.nextLine();

            if (juego.getMesSecreto().equals(eleccion)) {
                System.out.println("Acertaste");
                break;
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes: ");

            }

        } while (0 == 0);
    }

}
