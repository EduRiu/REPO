/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Edu
 */
public class CantanteFamoso {
    
    private String nombre;
    private Integer discoTop;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String nombre, Integer discoTop) {
        this.nombre = nombre;
        this.discoTop = discoTop;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDiscoTop() {
        return discoTop;
    }

    public void setDiscoTop(Integer discoTop) {
        this.discoTop = discoTop;
    }

    @Override
    public String toString() {
        return "CantanteFamoso{" + "nombre=" + nombre + ", discoTop=" + discoTop + '}';
    }
    
    
   
    
}
