/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicio.StockServicio;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class Main {

    /**
     * Se necesita una aplicación para una tienda en la cual queremos almacenar
     * los distintos productos que venderemos y el precio que tendrán. Además,
     * se necesita que la aplicación cuente con las funciones básicas. Estas las
     * realizaremos en el servicio. Como, introducir un elemento, modificar su
     * precio, eliminar un producto y mostrar los productos que tenemos con su
     * precio (Utilizar Hashmap). El HashMap tendrá de llave el nombre del
     * producto y de valor el precio. Realizar un menú para lograr todas las
     * acciones previamente mencionadas.
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        HashMap<String, Integer> stock = new HashMap();

        StockServicio main = new StockServicio();

        System.out.println("MENU MERCADITO 'CHIQUITO' ");
        System.out.println("1 - cargar inventario");
        System.out.println("2 - mostrar inventario");
        System.out.println("3 - ingresar a inventario");
        System.out.println("4 - eliminar inventario");
        System.out.println("5 - modificar inventario");

        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                main.cargaInventario(stock);
              // main.mostrarProducto(stock);
              // main.borrarProducto(stock);
              // main.modifcarProducto(stock);
                main.compraProducto(stock);
                break;
            case 2:
                main.mostrarProducto(stock);
                break;
            case 3:
                main.ingresarProducto(stock);
                break;
            case 4:
                main.borrarProducto(stock);
                break;
            case 5:
                main.modifcarProducto(stock);
                break;
           default:
               System.out.println("no hubo una opcion valida");
        }

    }

}
