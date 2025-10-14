
package Caso2;

/**
 *
 * @author matia
 */
import java.util.ArrayList;

// Clase que representa una biblioteca que contiene libros
public class Biblioteca {
    private String nombre;                  
    private ArrayList<Libro> libros = new ArrayList<>(); 

    // Constructor que inicializa la biblioteca con su nombre
    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }

    
    public void listarLibros() {
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }

    
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                return l;
            }
        }
        return null;
    }

    
    public void eliminarLibro(String isbn) {
        libros.removeIf(l -> l.getIsbn().equalsIgnoreCase(isbn));
    }

    
    public int obtenerCantidadLibros() {
        return libros.size();
    }

    
    public void filtrarLibrosPorAnio(int anio) {
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                l.mostrarInfo();
            }
        }
    }

    // Muestra los autores únicos de los libros disponibles
    public void mostrarAutoresDisponibles() {
        ArrayList<String> autoresUnicos = new ArrayList<>();
        for (Libro l : libros) {
            String idAutor = l.getAutor().getId();
            if (!autoresUnicos.contains(idAutor)) {
                autoresUnicos.add(idAutor);
                l.getAutor().mostrarInfo();
            }
        }
    }
}