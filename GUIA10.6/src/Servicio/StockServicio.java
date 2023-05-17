/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Stock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class StockServicio {

    private Scanner leer;

    public StockServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");

    }

    public void cargaInventario(HashMap<String, Integer> stock) {
        boolean seguir = false;
        do {
            System.out.println("ingrese el producto");
            String producto = leer.nextLine();
            System.out.println("A que precio lo va a vender?");
            Integer precio = leer.nextInt();

            stock.put(producto, precio);
            
            System.out.println("producto creado");
            leer.nextLine();
            System.out.println("ingresa otro producto?");
            if (!"s".equals(leer.nextLine())) {
                seguir = false;
            } else {
                seguir = true;
            }
        } while (seguir);

    }

    public void ingresarProducto(HashMap<String, Integer> stock) {

        System.out.println("cuantos productos nuevos va a ingresar?");
        int articulos = leer.nextInt();

        for (int i = 0; i < articulos; i++) {

            System.out.println("Que producto desea ingresar");
            String producto = leer.nextLine();
            System.out.println("Precio del nuevo producto?");
            Integer precio = leer.nextInt();

            stock.put(producto, precio);

        }

    }

    public void borrarProducto(HashMap<String, Integer> stock) {

        System.out.println("Que producto desea borrar del stock?");
        String remover = leer.nextLine();

        stock.remove(remover);

        System.out.println(" lista actualizada");
        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("producto: " + key + " precio: " + value);
        }

    }

    public void modifcarProducto(HashMap<String, Integer> stock) {

        System.out.println("que producto desea modificar");
        String modificar = leer.nextLine();

        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (modificar.equals(key)) {

                System.out.println("ingrese el valor");
                Integer modificaValue = leer.nextInt();
                stock.replace(key, modificaValue);

            }

            System.out.println("lista actualizada");
            System.out.println("productos: " + key + " precio: " + value);
        }

    }

    public void mostrarProducto(HashMap<String, Integer> stock) {
            System.out.println("LISTADO");
            for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
                System.out.println("producto: " + key + " precio: " + value );
        }
    }
}
