/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ej1.entidades;

/**
 *
 * @author Edu
 */
public class Persona {
//atributos, las caracteristicas que vamos a modelar

    public String nombre;
    public String apodo;
    public String nacionalidad;
    public int edad;
    public int documento;
    
//constructor, son los metodos para instanciar el objeto
    //este es constructor por parametros
   /* public Persona(String nombre, String apodo, String nacionalidad, int edad, int documento) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.documento = documento;
           
        
    }
*/

    public Persona() {
        //ese es el por defecto
    }
  
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

   
    
    
    
    
    
    
}
