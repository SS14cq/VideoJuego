
import hechizo.Expelliarmus;
import hechizo.OculusReparo;
import personaje.Harry;
import personaje.Hermione;
import personaje.Personaje;
import personaje.Ron;

public class Main {
    public static void main(String[] args) {
        Personaje harry = new Harry();
        Personaje ron = new Ron();
        Personaje hermione = new Hermione();

        // Hechizos iniciales
        System.out.println("Harry lanza");
        harry.lanzarHechizo();
        System.out.println("Ron lanza");
        ron.lanzarHechizo();
        System.out.println("Hermione lanza");
        hermione.lanzarHechizo();
        
        hermione.cambiarHechizo(new OculusReparo());
        
        System.out.println("Hemione ahora lanza");
        hermione.lanzarHechizo();
        

        harry.cambiarHechizo(new Expelliarmus());
        System.out.println("Harry ahora lanza");
        harry.lanzarHechizo();
    }
}

