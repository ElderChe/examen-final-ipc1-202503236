/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package efinal202503236;

/**
 *
 * @author elder
 */
abstract class Multimedia {
    
    
    private String titulo;
    
    private int duracion;

    public Multimedia(String titulo, int duracion) {
        this.titulo = titulo;
        
        this.duracion = duracion;
    }

    public String getTitulo() { return titulo; }
    
    
    public int getDuracion() { return duracion; }

    public abstract void reproducir();
}