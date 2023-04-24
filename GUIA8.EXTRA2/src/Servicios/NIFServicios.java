/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class NIFServicios {

    Scanner leer = new Scanner(System.in);
    NIF usuario = new NIF();

    /*
    Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá. 
    Una vez calculado, le asigna la letra que le corresponde según
     */
    public void crearNif() {

        String array[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        long resto;

        System.out.println("Ingrese el DNI");
        usuario.setDNI(leer.nextLong());

        resto = usuario.getDNI() % 23;

        for (int i = 0; i < array.length; i++) {

            if (i == resto) {

                usuario.setVerificador(array[i]);

            }

        }

    }

    /*
    Método mostrar(): que nos permita mostrar el NIF 
   (ocho dígitos, un guion y la letra en mayúscula; por ejemplo: 00395469-F).
     */
    public void mostrarNif() {

        crearNif();

        System.out.println("el NIF para el DNI:" + usuario.getDNI() + " - " + usuario.getVerificador());

    }

    /*
         String [] array = new String[22];
        array[0] = "T";
        array[1] = "T";
        array[2] = "T";
        array[3] = "T";
        array[4] = "T";
        array[5] = "T";
        array[6] = "T";
        array[7] = "T";
        array[8] = "T";
        array[9] = "T";
        array[10] = "T";
        array[11] = "T";
        array[12] = "T";
        array[13] = "T";
        array[14] = "T";
        array[15] = "T";
        array[16] = "T";
        array[17] = "T";
        array[18] = "T";
        array[19] = "T";
        array[20] = "T";
        array[21] = "T";
        array[22] = "T";
     */
}
