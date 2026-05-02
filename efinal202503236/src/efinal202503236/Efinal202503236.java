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

    Cancion c1 = new Cancion("Mia", 200, "Bad Bunny");
    Cancion c2 = new Cancion("Bangarang", 180, "Skrillex");
    Cancion c3 = new Cancion("Bones", 210, "Imagine Dragons");

    Playlist lista = new Playlist();

    lista.agregarCancion(c1);
    lista.agregarCancion(c2);
    lista.agregarCancion(c3);
    
    

    
    lista.mostrarPlaylist();

    System.out.println("Buscando");

    lista.siguiente();
    
    
    lista.siguiente();
    lista.anterior();  

    System.out.println("Eliminando ahora");
    lista.eliminarActual();

    System.out.println("Lista ahora");
    lista.mostrarPlaylist();
}
    
}
