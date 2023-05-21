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
public class Stock {
    
    private String producto;
    private Integer precio;

    public Stock() {
    }

    public Stock(String producto, Integer precio) {
        this.producto = producto;
        this.precio = precio;
        
    }



    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.producto);
        hash = 59 * hash + Objects.hashCode(this.precio);
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
        final Stock other = (Stock) obj;
        if (!Objects.equals(this.producto, other.producto)) {
            return false;
        }
        if (!Objects.equals(this.precio, other.precio)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stock{" + "producto=" + producto + ", precio=" + precio + '}';
    }
    
    private Integer cantidadArticulo;
    private String articulo;

    public Stock(Integer cantidadArticulo, String articulo) {
        this.cantidadArticulo = cantidadArticulo;
        this.articulo = articulo;
    }

    public Integer getCantidadArticulo() {
        return cantidadArticulo;
    }

    public void setCantidadArticulo(Integer cantidadArticulo) {
        this.cantidadArticulo = cantidadArticulo;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }
    
    
    
    
}
