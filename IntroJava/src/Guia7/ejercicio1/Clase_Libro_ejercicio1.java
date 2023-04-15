/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Edu
 */

/*
Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.

 */
public class Clase_Libro_ejercicio1 {

    //atributos
    
    private int isbn;
    private String titulo;
    private String autor;
    private int numerodepagina;

    //GET y SET
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumerodepagina() {
        return numerodepagina;
    }

    public void setNumerodepagina(int numerodepagina) {
        this.numerodepagina = numerodepagina;
    }
    
    //contructo vacio
    public Clase_Libro_ejercicio1() {
    }
    
    //constructor
    public Clase_Libro_ejercicio1(int isbn, String titulo, String autor, int numerodepagina) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numerodepagina = numerodepagina;
    }

    //seteado el libro
    public void cargarLibro() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese los datos del libro");
        
        System.out.print("ISBN ");
        this.setIsbn(leer.nextInt());
        leer.nextLine();
        
        System.out.print("Titulo ");
        this.setTitulo(leer.nextLine());
        
        
        System.out.print("Autor ");
        this.setAutor(leer.nextLine());
        
        
        System.out.print("N. de Paginas ");
        this.setNumerodepagina(leer.nextInt());
        leer.nextLine();
       

    }
    
    //muestro el "libro" usando el get
    public void mostrarLibro() {
        System.out.println("el ISBN es " + this.getIsbn());
        System.out.println("el Titulo es " + this.getTitulo());
        System.out.println("el Autor es " + this.getAutor());
        System.out.println("el numero de Pagina es " + this.getNumerodepagina());
    }

}
