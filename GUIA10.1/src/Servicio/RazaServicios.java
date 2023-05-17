/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class RazaServicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<String> razas = new ArrayList<>();

    public void cargarRaza() {
        boolean seguir = false;

        do {
            System.out.println("ingrese la raza");
            razas.add(leer.nextLine());
            System.out.println("desea realizar otro ingreso?");

            if (!"s".equals(leer.nextLine())) {
                seguir = false;
            } else {
                seguir = true;
            }

        } while (seguir);

        System.out.println("ustede cargo: ");
        for (String raza : razas) {
            System.out.println(raza);
        }
        int tamañoInicial = razas.size();

        System.out.println("que raza desea sacar de la lista");
        String remueve = leer.nextLine();
        Iterator remover = razas.iterator();
        
        while (remover.hasNext()) {
            if (remover.next().equals(remueve)) {
                remover.remove();
            }
        }

        int tamañoRemover = razas.size();
        
        
        if (tamañoInicial == tamañoRemover) {
            System.out.println("no se elimino ningun elemento");
            Collections.sort(razas);
            System.out.println("el listado ordenado es: ");

        } else {
            Collections.sort(razas);
            System.out.println("el listado ordenado es: ");

        }
        
        for (String raza : razas) {
            System.out.println(raza);
        }

    }

}
