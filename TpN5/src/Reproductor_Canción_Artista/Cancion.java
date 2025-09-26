
package Reproductor_Canción_Artista;

/**
 *
 * @author matia
 */
public class Cancion {
    private String titulo;
    private Artista artista; // Asociación unidireccional

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }
}