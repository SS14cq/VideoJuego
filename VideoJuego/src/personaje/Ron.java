/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaje;

import hechizo.Expelliarmus;

public class Ron extends Personaje {
    public Ron() {
        super("Ron Weasley", new Expelliarmus());
    }
    @Override
    public void display(){
        System.out.println("Soy Ron");
    }
    
}
