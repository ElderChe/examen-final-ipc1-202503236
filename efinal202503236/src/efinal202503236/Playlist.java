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
        System.out.println("Playlist:");

        while (temp != null) {
            System.out.println(temp.dato.getTitulo() + " - " + temp.dato.getArtista());
            temp = temp.siguiente;
        }
    }
}