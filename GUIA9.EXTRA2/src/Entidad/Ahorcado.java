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
public class Ahorcado {
    /*
   
    Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, 
    un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad jugadas máximas que puede realizar el usuario. 
    Definir los siguientes métodos en AhorcadoService:

    */
    
    private char [] palabraBuscada;
    private int letrasEncontradas;
    private int partidas;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabraBuscada, int letrasEncontradas, int partidas) {
        this.palabraBuscada = palabraBuscada;
        this.letrasEncontradas = letrasEncontradas;
        this.partidas = partidas;
    }

    public char[] getPalabraBuscada() {
        return palabraBuscada;
    }

    public void setPalabraBuscada(char[] palabraBuscada) {
        this.palabraBuscada = palabraBuscada;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getPartidas() {
        return partidas;
    }

    public void setPartidas(int partidas) {
        this.partidas = partidas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabraBuscada=" + palabraBuscada + ", letrasEncontradas=" + letrasEncontradas + ", partidas=" + partidas + '}';
    }

    
    
    
    
}

  