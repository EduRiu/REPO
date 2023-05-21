/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Objects;

/**
 *
 * @author Edu
 */
public class Libreria {
    
    private String titulo;
    private String autor;
    private Integer cantidad;
    private Integer prestado;

    public Libreria() {
    }

    public Libreria(String titulo, String autor, Integer cantidad, Integer prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidad = cantidad;
        this.prestado = prestado;
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

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getPrestado() {
        return prestado;
    }

    public void setPrestado(Integer prestado) {
        this.prestado = prestado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.titulo);
        hash = 83 * hash + Objects.hashCode(this.autor);
        hash = 83 * hash + Objects.hashCode(this.cantidad);
        hash = 83 * hash + Objects.hashCode(this.prestado);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libreria other = (Libreria) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.cantidad, other.cantidad)) {
            return false;
        }
        if (!Objects.equals(this.prestado, other.prestado)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
       
        return "Los libros son:" 
                + "titulo=" + titulo + 
                ", autor=" + autor + 
                ", cantidad=" + cantidad 
                + ", prestado=" + prestado;
    }
    
    
    
    
}
