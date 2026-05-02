/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package efinal202503236;

/**
 *
 * @author elder
 */
class NodoDoble {
    Cancion dato;
    
    NodoDoble anterior;
    NodoDoble siguiente;

    public NodoDoble(Cancion dato) {
        this.dato = dato;
        
        
        this.anterior = null;
        this.siguiente = null;
    }
}
