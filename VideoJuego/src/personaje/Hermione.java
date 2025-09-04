/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaje;

import hechizo.WingardiumLeviosa;

public class Hermione extends Personaje {
    public Hermione() {
        super("Hermione Granger", new WingardiumLeviosa());
    }

    @Override
    public void display(){
        System.out.println("Soy Hermione");
    }
    
}
