/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package efinal202503236;

/**
 *
 * @author elder
 */
class Playlist {
    private NodoDoble cabeza;
    private NodoDoble cola;
    
    
    private NodoDoble actual;
    private int tamaño;

    public Playlist() {
        cabeza = null;
        cola = null;
        
        
        actual = null;
        tamaño = 0;
    }

    public void agregarCancion(Cancion c) {
        NodoDoble nuevo = new NodoDoble(c);

        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            
            
            
            actual = nuevo; 
            
            
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            
            
            cola = nuevo;
            
            
        }
        tamaño++;
    }

    public void mostrarPlaylist() {
        NodoDoble temp = cabeza;

        System.out.println("Playlist actual:");
        while (temp != null) {
            
            
            System.out.println(temp.dato.getTitulo() + " - " + temp.dato.getArtista());
            
            temp = temp.siguiente;
        }
    }

  
    public Cancion siguiente() {
        if (actual == null) {
            System.out.println("No hay ninguna canción en espera");
            
            return null;
        }

        if (actual.siguiente == null) {
            System.out.println("Esta es la ultima");
            return null;
        }

        actual = actual.siguiente;
        
        
        actual.dato.reproducir();
        
        return actual.dato;
    }

   
    public Cancion anterior() {
        if (actual == null) {
            System.out.println("No hay cancion");
            return null;
        }

        if (actual.anterior == null) {
            System.out.println("Estas en la primera");
            return null;
        }

        actual = actual.anterior;
        
        actual.dato.reproducir();
        
        
        return actual.dato;
    }


    public void eliminarActual() {
        if (actual == null) {
            System.out.println("No hay que eliminar");
            
            return;
        }

        System.out.println("Se elimino: " + actual.dato.getTitulo());

        
        if (cabeza == cola) {
            cabeza = null;
            
            cola = null;
            actual = null;
        }
      
        else if (actual == cabeza) {
            cabeza = cabeza.siguiente;
            
            
            cabeza.anterior = null;
            actual = cabeza;
        }
       
        else if (actual == cola) {
            cola = cola.anterior;
            
            cola.siguiente = null;
            
            actual = cola;
        }
    
        else {
            actual.anterior.siguiente = actual.siguiente;
            
            
            actual.siguiente.anterior = actual.anterior;
            actual = actual.siguiente;
        }

        tamaño--;
    }
}