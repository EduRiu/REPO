/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.RenderingHints;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class Main {

    /**
     * 4. Almacena en un HashMap los códigos postales de 10 ciudades a elección
     * de esta página: https://mapanet.eu/index.htm. Nota: Poner el código
     * postal sin la letra, solo el numero. • Pedirle al usuario que ingrese 10
     * códigos postales y sus ciudades. • Muestra por pantalla los datos
     * introducidos • Pide un código postal y muestra la ciudad asociada si
     * existe sino avisa al usuario. • Muestra por pantalla los datos • Agregar
     * una ciudad con su código postal correspondiente más al HashMap. • Elimina
     * 3 ciudades existentes dentro del HashMap
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //creo el HashMap
        HashMap<Integer, String> listaCiudades = new HashMap<>();
        //cargo el HashMap
        for (int i = 0; i < 3; i++) {

            System.out.println("Ingrese codigo postal y la ciudad");
            System.out.println("CODIGO POSTAL");
            Integer codigo = leer.nextInt();
            System.out.println("CIUDAD");
            String ciudad = leer.next();

            listaCiudades.put(codigo, ciudad);
        }

        //mostrar el HashMap
        for (Map.Entry<Integer, String> entry : listaCiudades.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("CODIGO POSTAL: " + key + " CIUDAD: " + value);
        }

        //pido el codigo
        do {
            System.out.println("BUSQUEMOS UNA CIUDAD:");
            Integer buscarCodigo = leer.nextInt();
            /*
                                                                                //devuelve true si esta en la lista
                                                                                if (listaCiudades.containsKey(buscarCodigo) == true) {
                                                                                //recorro la lista para encontrar el valor de la llave 
                                                                                    for (Map.Entry<Integer, String> entry : listaCiudades.entrySet()) {
                                                                                        Integer key = entry.getKey();
                                                                                        String value = entry.getValue();
                                                                                 //muestro el valor
                                                                                if (buscarCodigo.equals(key)) {
                                                                                    System.out.println("la ciudad buscada es: " + value);
                                                                                 }
                                                                                }
                                                                               }
             */

            //simplifico la busqueda
            if (listaCiudades.containsKey(buscarCodigo)) {
                System.out.println("LA CIUDAD ES: " + listaCiudades.get(buscarCodigo));
            } else {
                System.out.println("NO EXISTE ESE CODIGO POSTATL");
            }
            System.out.println(
                    "realiza otra busqueda? s/n");
            if (leer.next()
                    .equalsIgnoreCase("n")) {
                break;
            }
        } while (true);
        System.out.println("----------------------------------------");
        //para no sacar la variable del for, creo de nuevo
        System.out.println("INGRESEMOS UNA CIUDAD");
        System.out.println("CODIGO");
        Integer codigo = leer.nextInt();
        System.out.println("INGRESE LA CIUDAD");
        String ciudad = leer.next();

        listaCiudades.put(codigo, ciudad);
        System.out.println(".....LISTADO ACTUALIZADO.....");
        System.out.println(listaCiudades.toString());
        //remover
        System.out.println("---------REMOVER--------");
        do {

            System.out.println("QUE DESEA BUSCAR -- CODIGO O CIUDAD");
            String eleccion = leer.next();

            if (eleccion.equals("CODIGO")) {
                System.out.println("ingrese el codigo postal");
                Integer numero = leer.nextInt();

                listaCiudades.keySet().remove(numero);

            } else if (eleccion.equals("CIUDAD")) {
                System.out.println("ingrese la ciudad");
                ciudad = leer.next();
                listaCiudades.values().remove(ciudad);
            }

            System.out.println("elimina otra ciudad S/N");
            
            if (leer.next().equalsIgnoreCase("n")) {
                break;
            }

            for (Map.Entry<Integer, String> entry : listaCiudades.entrySet()) {
                Integer key = entry.getKey();
                String value = entry.getValue();
                System.out.println("CODIGO POSTAL: " + key + " CIUDAD: " + value);
            }

        } while (true);
        
        System.out.println("");
        System.out.println(listaCiudades.toString());

    }
}
