/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Libreria;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;

/**
 *
 * @author Edu
 */
public class LibreriaServicios {

    private Scanner leer;

    public LibreriaServicios() {

        this.leer = new Scanner(System.in).useDelimiter("\n");

    }

    /*
     • Método prestamo(): 
        * El usuario ingresa el titulo del libro que quiere prestar y se lo
        busca en el conjunto. 
        * Si está en el conjunto, se llama con ese objeto Libro al
        método. 
        * El método se incrementa de a uno, como un carrito de compras, el
        atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
        cada vez que se realice un préstamo del libro. 
        * No se podrán prestar libros de los
        que no queden ejemplares disponibles para prestar. 
        * Devuelve true si se ha  podido realizar la operación y false en caso contrario.
     */
    public boolean prestamo(HashSet<Libreria> stock) {

        boolean retorno = false;
        int cantidad;
        int prestamo;

        Iterator<Libreria> listaLibreria = stock.iterator();

        System.out.println("ingrese el libro a buscar");
        String busqueda = leer.next();
        System.out.println("cuantos libros va a retirar?");
        Integer retiro = leer.nextInt();

        while (listaLibreria.hasNext()) {

            Libreria next = listaLibreria.next();

            if (next.getTitulo().equals(busqueda)) {

                if ((next.getCantidad() - retiro) >= 0) {
                    cantidad = next.getCantidad() - retiro;
                    next.setCantidad(cantidad);
                    prestamo = next.getPrestado() + retiro;
                    next.setPrestado(prestamo);
                    retorno = true;
                    System.out.println("retiro : " + retiro + "ejemplar, quedan en stock: " + cantidad);
                } else {
                    System.out.println("la cantidad ingresada supera la cantidad de stock");
                    retorno = false;
                }
            }

        }
        return retorno;
    }
    
    /*
     Método devolucion(): El usuario ingresa el titulo del libro que quiere
     * devolver y se lo busca en el conjunto. Si está en el conjunto, se llama
     * con ese objeto al método. El método decrementa de a uno, como un carrito
     * de compras, el atributo ejemplares prestados, del libro seleccionado por
     * el usuario. Esto sucederá cada vez que se produzca la devolución de un
     * libro. No se podrán devolver libros donde que no tengan ejemplares
     * prestados. Devuelve true si se ha podido realizar la operación y false en
     * caso contrario. 
    */
    
     public boolean devolucion(HashSet<Libreria> stock) {

        boolean retorno = false;
        int cantidad;
        int prestamo;

        Iterator<Libreria> listaLibreria = stock.iterator();

        System.out.println("ingrese el libro a buscar");
        String busqueda = leer.next();
        System.out.println("cuantos libros va a devolver?");
        Integer retiro = leer.nextInt();

        while (listaLibreria.hasNext()) {

            Libreria next = listaLibreria.next();

            if (next.getTitulo().equals(busqueda)) {

                if ((next.getPrestado() > 0)) {
                    cantidad = next.getCantidad() + retiro;
                    next.setCantidad(cantidad);
                    prestamo = next.getPrestado() - retiro;
                    next.setPrestado(prestamo);
                    retorno = true;
                    System.out.println("ingreso : " + retiro + "ejemplar, del libro: " + busqueda);
                } else {
                    System.out.println("el libro: " + busqueda + "no tiene ejemplares prestados");
                    retorno = false;
                }
            }

        }
        return retorno;
    }
    
}
