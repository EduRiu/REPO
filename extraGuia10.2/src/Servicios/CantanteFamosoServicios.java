/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class CantanteFamosoServicios {

    private Scanner leer;

    public CantanteFamosoServicios() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void cargarCantante(ArrayList<CantanteFamoso> lista) {

        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese el cantante: ");
            String nombre = leer.next();

            System.out.println("ingrese el disco mas vendido, (en millones de unidades)");
            Integer disco = leer.nextInt();

            lista.add(new CantanteFamoso(nombre, disco)); //armo el objeto

        }
        System.out.println(lista.toString());

    }

    public void menu(ArrayList<CantanteFamoso> lista) {
        boolean salir = false;
        do {

            System.out.println("------MENU PRINCIPAL------");
            System.out.println("--------OPCION 1---------");
            System.out.println("---AGREGAR UN CANTANTE---");
            System.out.println("--------OPCION 2--------");
            System.out.println("-----MOSTRAR CANTANTE-----");
            System.out.println("--------OPCION 3--------");
            System.out.println("----ELIMINAR CANTANTE----");
            System.out.println("--------OPCION 4--------");
            System.out.println("-------DESEA SALIR-------");

            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    agregarCantante(lista);
                    menu(lista);
                    break;
                case 2:
                    for (CantanteFamoso cantanteFamoso : lista) {
                        System.out.println(cantanteFamoso);
                    }
                    menu(lista);
                    break;
                case 3:
                    elimnarCantante(lista);
                    menu(lista);
                    break;
                case 4:
                    salir = false;

            }

        } while (salir);

        System.out.println(lista.toString());

    }

    public void agregarCantante(ArrayList<CantanteFamoso> lista) {

        for (int i = 0; i < 1; i++) {
            System.out.println("ingrese el cantante: ");
            String nombre = leer.next();

            System.out.println("ingrese el disco mas vendido, (en millones de unidades)");
            Integer disco = leer.nextInt();

            lista.add(new CantanteFamoso(nombre, disco)); //armo el objeto

        }
        System.out.println("El lista actualizado es: ");

        for (CantanteFamoso cantanteFamoso : lista) {
            System.out.print(cantanteFamoso);
        }

    }

    public void elimnarCantante(ArrayList<CantanteFamoso> lista) {

        Iterator<CantanteFamoso> elimnar = lista.iterator();

        System.out.println("que cantante desea eliminar: ");
        String remover = leer.next();

        while (elimnar.hasNext()) {
            CantanteFamoso next = elimnar.next();

            if (next.getNombre().equals(remover)) {
                elimnar.remove();

            }

        }

        System.out.println("LISTADO ACTUALIZADO");
        for (CantanteFamoso cantanteFamoso : lista) {
            System.out.println(cantanteFamoso.getNombre() + cantanteFamoso.getDiscoTop());
        }

    }

}
