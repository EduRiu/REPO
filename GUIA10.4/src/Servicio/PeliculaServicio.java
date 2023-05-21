/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import Main.Main;

/**
 *
 * @author Edu
 */
public class PeliculaServicio {

    private Scanner leer;
    

    public PeliculaServicio() {
        
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void cargarPelicula(ArrayList<Pelicula> film) {
        boolean seguir = false;

        do {

            System.out.println("ingrese el titulo");
            String titulo = leer.nextLine();
            System.out.println("ingrese el director");
            String director = leer.nextLine();
            System.out.println("ingrese la duracion en horas");
            double duracion = leer.nextDouble();

            film.add(new Pelicula(titulo, director, duracion));
            leer.nextLine();

            System.out.println("ingresa otra pelicula");
            if (!"s".equals(leer.nextLine())) {
                seguir = false;
            } else {
                seguir = true;
            }

        } while (seguir);

    }

    //Mostrar en pantalla todas las películas.
    public void mostrarPeliculas(ArrayList<Pelicula> film) {

        System.out.println("las peliculas existentes son: ");
        for (Pelicula pelicula : film) {
            System.out.println(pelicula);
        }

    }

    //Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void ordenarPeliculas(ArrayList<Pelicula> film) {

        Iterator<Pelicula> busqueda = film.iterator();

        while (busqueda.hasNext()) {
            Pelicula next = busqueda.next();

            if (next.getDuracion() > 1) {

                System.out.println("las peliculas que duran mas de una hora son: " + next.getTitulo());

            }
        }
    }
    /*
        Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
        pantalla.
     */
   
        public static Comparator<Pelicula> ordenarDuracionDescendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    
  
        
        
   /*
    Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
    pantalla.
  */
        public static Comparator<Pelicula> ordenarDuracionAscendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
        
        
        
        
        

}
