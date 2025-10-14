
package Caso2;

/**
 *
 * @author matia
 */
// Clase que representa un libro dentro de la biblioteca
public class Libro {
    private String isbn;              
    private String titulo;            
    private int anioPublicacion;      
    private Autor autor;              

    // Constructor para inicializar el libro con su autor
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    // Getters para acceder a los atributos
    public String getIsbn() {
        return isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    // Muestra la información del libro y su autor
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("ISBN: " + isbn);
        System.out.println("Año: " + anioPublicacion);
        autor.mostrarInfo();
    }
}