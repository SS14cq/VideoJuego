/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaje;

import hechizo.ExpectoPatronum;

public class Harry extends Personaje {
    public Harry() {
        super("Harry Potter", new ExpectoPatronum());
    }

    @Override
    public void display() {
        System.out.println("Harry");
    }
}
