/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Stock;
import java.util.ArrayList;
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
            String producto = leer.next();
            System.out.println("A que precio lo va a vender?");
            Integer precio = leer.nextInt();

            stock.put(producto, precio);

            System.out.println("producto creado");
            leer.nextLine();
            System.out.println("ingresa otro producto?");
            if (!"s".equals(leer.next())) {
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
            String producto = leer.next();
            System.out.println("Precio del nuevo producto?");
            Integer precio = leer.nextInt();

            stock.put(producto, precio);

        }

    }

    public void borrarProducto(HashMap<String, Integer> stock) {

        System.out.println("Que producto desea borrar del stock?");
        String remover = leer.next();

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
        String modificar = leer.next();

        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (modificar.equals(key)) {

                System.out.println("ingrese el valor");
                Integer modificaValue = leer.nextInt();
                stock.replace(key, modificaValue);

            }

        }
        for (Map.Entry<String, Integer> entry1 : stock.entrySet()) {
            String key1 = entry1.getKey();
            Integer value1 = entry1.getValue();

            System.out.println("lista actualizada");
            System.out.println("productos: " + key1 + " precio: " + value1);
        }

    }

    public void mostrarProducto(HashMap<String, Integer> stock) {
        System.out.println("LISTADO");
        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("producto: " + key + " precio: " + value);
        }
    }

    //funciona la lista si la cantidad de productos es distinta.
    public void compraProducto(HashMap<String, Integer> stock) {

        int suma = 0;
        Integer cantidad = 0;
        int total = 0;

        HashMap<Integer, String> resumen = new HashMap();

        ArrayList<String> listaCompra = new ArrayList();

        do {
           
                System.out.println("que producto a sumar a la compra?");
                String compra = leer.next();
                System.out.println("Cantidad de productos");
                cantidad = leer.nextInt();

                resumen.put(cantidad, compra);

                for (Map.Entry<String, Integer> entry : stock.entrySet()) {
                    String key = entry.getKey();
                    Integer value = entry.getValue();

                    if (compra.equals(key)) {
                        total = (cantidad * value);
                        suma += total;

                        listaCompra.add(key);
                       } 
                }
            System.out.println("ingresa otro producto?");

            if (leer.next().equalsIgnoreCase("n")) {
                break;
            }
        } while (true);

        System.out.println("SE REALIZARON: " + listaCompra.size() + " ventas");

        System.out.println("LISTADO DE PRODUCTOS: ");
        int sumarProducto = 0;
        for (Map.Entry<Integer, String> entry : resumen.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            sumarProducto += key;
            System.out.println("Cantidad: ---> " + key + " Producto: ---->" + value);
        }
        System.out.println("suma total: $ " + suma + "la cantidad de productos es: " + sumarProducto);
    }

}
