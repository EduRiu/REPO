/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionguia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/**
 *
 * @author Edu
 */
public class CollectionGuia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Integer> listadoNumeros = new ArrayList();
        TreeSet<String> listadoNombre = new TreeSet();
        HashMap<Integer, String> alumnoCurso = new HashMap();

//ArrayList cargo con .add
        listadoNumeros.add(10);
        listadoNumeros.add(5);
        listadoNumeros.add(86);
        listadoNumeros.add(12);
        listadoNumeros.add(22);

//TreeSet cargo con .add
//ordena los elementos en forma ascendete
//no admite duplicados
        listadoNombre.add("Eduardo");
        listadoNombre.add("Aldana");
        listadoNombre.add("Mia");
        listadoNombre.add("Milo");
        listadoNombre.add("Manu");

//HashMAP cargo con .put
//no pueden haber valores duplicados, porque usa el algoritmo para convertir en hash
        alumnoCurso.put(1, "Gordita");
        alumnoCurso.put(2, "Mora");
        alumnoCurso.put(3, "Mate");
        alumnoCurso.put(4, "Maggie");
        alumnoCurso.put(5, "Dona");

        //remover ArrayList
        // listadoNumeros.remove(0); //por indice
        // listadoNumeros.remove(Integer.valueOf(5)); //por contenido
        //remover conjuntos(set)
        listadoNombre.remove("Mia");

        //<--------------PARA MOSTRAR LAS COSAS-------------------->
        //mostrar las cosas, se recorre con en foreach
        System.out.println("<--arraylist-->");
        for (int numero : listadoNumeros) {
            System.out.println(numero);
        }

        System.out.println("<--TreeSet-->");
        for (String familia : listadoNombre) {
            System.out.println(familia);
        }

        //con MAP
        System.out.println("<--HashMap-->");
        for (Map.Entry<Integer, String> entry : alumnoCurso.entrySet()) {
            System.out.println("el numero: " + entry.getKey() + " es para el alumno: " + entry.getValue());
        }

        //sin MAP
        for (Integer num : alumnoCurso.keySet()) {
            System.out.println("el numero es: " + num);
        }

        for (String nom : alumnoCurso.values()) {
            System.out.println("el nombre es: " + nom);
        }

        /*
        HashMap<Integer> personas = new HashMap<>;
        String n1 = “Albus”;
        String n2 = “Severus”;
        personas.add(n1);
        personas.add(n2);
         */
        HashMap<Integer, String> personas = new HashMap<>();
        Integer nn1 = 1;
        String n1 = "Albus";
        Integer nn2 = 2;
        String n2 = "Severus";
        personas.put(nn1, n1);
        personas.put(nn2, n2);

        //iterador : - para recorrer, almacenar, eliminar informacion
        //aca solo recorremos (line 108) y mostramos (line 109)
        Iterator iteratorPrueba = listadoNumeros.iterator(); //enlazamos el metodo con la lista

        System.out.println("la lista es: ");
        while (iteratorPrueba.hasNext()) {     //aca le digo que si el proximo valor sea TRUE (que exista)
            System.out.println(iteratorPrueba.next() + " "); //que me muestre el valor
        }
        System.out.println("");

        //para remover
        Iterator iteradorRemove = listadoNumeros.iterator(); //enlazamos ahora con un objeto del metodo iterador para remover
        while (iteradorRemove.hasNext()) {                     //recorro
            if (iteradorRemove.next().equals(5)) {         //busco   
                iteradorRemove.remove();                     //elimino
            }
        }

        Iterator iteradorRemove2 = listadoNombre.iterator();
        while (iteradorRemove2.hasNext()) {
            if (iteradorRemove2.next().equals("Eduardo")) {
                iteradorRemove2.remove();
            }
        }
        
        /*
        ArrayList<String> = new ArrayList()
        bebidas.put(“café);
        bebidas.add(“té”);
        Iterator<String> it =bebidas.iterator();
        whale (it.next()){
        if (it.next().equals(“café”)){
        it.remove();
        }
        */
        
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("cafe");
        bebidas.add("te");
        Iterator it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("cafe")) {
                it.remove();
            } 
        }
        
        
        //>>>>>.......EMPEZAMOS A ORDEDAR.......<<<<<
        //orden ascendete (.sort) - solo para numeros
        //solo se ordenan la listas
        //los demas, tiene que convertirse a lista para ordenarse
        
        //NOTA LOS TreeSet y los TreeMap se ordenan solos
        
        
        Collections.sort(listadoNumeros);
        
        for (int numero : listadoNumeros) {
            System.out.println(numero);
            System.out.println("falta el 5 que lo removi line 115");
        }
        
        
        
        
        /*
        EJERCICIO
        ¡Es tu turno! Crea una lista de Libros y muestra el título de cada uno con un bucle.
        */
        
        ArrayList<String> Libros = new ArrayList<>();
        Libros.add("La casa de papel");
        Libros.add("La vida secreta de tus mascotas");
        Libros.add("Lluvia de Hamburguesas");
        Libros.add("La Cienca de lo absurdo");
        Libros.add("Perros Salchichas");
        Libros.add("El poder del querer");
        Libros.add("Los Caballeros de Zodiaco");
        
        System.out.println("");
        System.out.println("Los titulos disponibles son: ");
        for (String Libro : Libros) {
            
            System.out.println("* ->" + Libro);
        }
        
        
        
        
    }

}
