/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package efinal202503236;

/**
 *
 * @author elder
 */
public class Efinal202503236 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Cancion c1 = new Cancion("Mia", 200, "Bad bunny");
        Cancion c2 = new Cancion("Bangarang", 180, "Skrillex");
        Cancion c3 = new Cancion("Bones", 210, "Imagine Dragons");

        c1.reproducir();
        c2.reproducir();
        c3.reproducir();
    }
    
}
