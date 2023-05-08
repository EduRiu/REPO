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
public class Curso {
    
    private String nombreCurso;
    private int cantidadHorasDiarias;
    private int cantidadDiasSemananal;
    private String turno;
    private int precioHora;
    private  String [] alumnos;

    public Curso() {
    }

    public Curso(String nombreCurso, int cantidadHorasDiarias, int cantidadDiasSemananal, String turno, int precioHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasDiarias = cantidadHorasDiarias;
        this.cantidadDiasSemananal = cantidadDiasSemananal;
        this.turno = turno;
        this.precioHora = precioHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasDiarias() {
        return cantidadHorasDiarias;
    }

    public void setCantidadHorasDiarias(int cantidadHorasDiarias) {
        this.cantidadHorasDiarias = cantidadHorasDiarias;
    }

    public int getCantidadDiasSemananal() {
        return cantidadDiasSemananal;
    }

    public void setCantidadDiasSemananal(int cantidadDiasSemananal) {
        this.cantidadDiasSemananal = cantidadDiasSemananal;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(int precioHora) {
        this.precioHora = precioHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", cantidadHorasDiarias=" + cantidadHorasDiarias + ", cantidadDiasSemananal=" + cantidadDiasSemananal + ", turno=" + turno + ", precioHora=" + precioHora + ", alumnos=" + alumnos + '}';
    }

    
    
        
}
