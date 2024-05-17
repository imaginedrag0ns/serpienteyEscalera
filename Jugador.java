/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author diego
 */
public class Jugador {
    private String nombre;
    private int posicion;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.posicion = 1; 
    }

    public String getNombre() {
        return nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int nuevaPosicion) {
        posicion = nuevaPosicion;
    }
}


