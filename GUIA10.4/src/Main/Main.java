/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Pelicula;
import Servicio.PeliculaServicio;
import Utilidad.Comparadores;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Edu
 */
public class Main {

    /**
    Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
   tendremos una clase Pelicula con el título, director y duración de la película (en horas).
   Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
   que se pide a continuación:
   En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
   todos sus datos y guardándolos en el objeto Pelicula.
   Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
   crear otra Pelicula o no.
   Después de ese bucle realizaremos las siguientes acciones:
        */
    public static void main(String[] args) {
        
        ArrayList<Pelicula> film = new ArrayList<>();
        PeliculaServicio main = new PeliculaServicio();
        
        
        main.cargarPelicula(film);
        main.mostrarPeliculas(film);
        main.ordenarPeliculas(film);
        
        Collections.sort(film, Comparadores.ordenarDuracionDescendente);
        System.out.println("las peliculas de mayor a menor: ");
        for (Pelicula pelicula : film) {
            System.out.println(pelicula.getDuracion());
        }
        
        Collections.shuffle(film);
        
        Collections.sort(film, Comparadores.ordenarDuracionAscendete);
        System.out.println("las peliculas de menos a mayor: ");
        for (Pelicula pelicula : film) {
            System.out.println(pelicula.getDuracion());
            
        }
                
        Collections.shuffle(film);
        
        Collections.sort(film, Comparadores.ordenarTitulo);
        System.out.println("Titulos Alfabeticamente");
        for (Pelicula pelicula : film) {
            System.out.println(pelicula);
        }
        
        Collections.shuffle(film);
        Collections.sort(film, Comparadores.ordenarDirector);
        System.out.println("Directores Alfabeticamente");
        for (Pelicula pelicula : film) {
            System.out.println(pelicula);
        }
        
        
        
        
    }
    
}
