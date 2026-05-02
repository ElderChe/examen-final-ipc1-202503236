/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package efinal202503236;

/**
 *
 * @author elder
 */
class Cancion extends Multimedia {
    private String artista;

    public Cancion(String titulo, int duracion, String artista) {
        super(titulo, duracion);
        this.artista = artista;
    }

    public String getArtista() { return artista; }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo: " + getTitulo() + " - " + artista);
    }
}
