/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaje;

import hechizo.Hechizo;

/**
 *
 * @author sarit
 */
public abstract class Personaje {
    protected String nombre;
    protected Hechizo hechizo;

    public Personaje(String nombre, Hechizo hechizo) {
        this.nombre = nombre;
        this.hechizo = hechizo;
    }
    
    public abstract void display();
    
    public void lanzarHechizo(){
        hechizo.hechizar();
    }

    public void cambiarHechizo(Hechizo nuevoHechizo){
        this.hechizo = nuevoHechizo;
        System.out.println(nombre + " ha cambiado su hechizo");
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
