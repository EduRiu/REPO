/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Edu
 */
public class Alumno {
    
    public String alumno;
    private ArrayList<Integer> notas;

    public Alumno() {
    }

    public Alumno(String alumno, ArrayList<Integer> notas) {
        this.alumno = alumno;
        this.notas = notas;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "Alumno=" + alumno + ", notas=" + notas + '}';
    }

    
    
    
    
}