
package Caso2;

/** *
 * @author matia

 */
// Clase principal para probar el sistema de biblioteca
public class Main {
    public static void main(String[] args) {
        // Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // Crear autores
        Autor a1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor a2 = new Autor("A002", "Jorge Luis Borges", "Argentina");
        Autor a3 = new Autor("A003", "Isabel Allende", "Chilena");

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro("L001", "Cien años de soledad", 1967, a1);
        biblioteca.agregarLibro("L002", "Ficciones", 1944, a2);
        biblioteca.agregarLibro("L003", "La casa de los espíritus", 1982, a3);
        biblioteca.agregarLibro("L004", "El Aleph", 1949, a2);
        biblioteca.agregarLibro("L005", "Eva Luna", 1987, a3);

        // Listar todos los libros
        System.out.println(" Listado completo de libros:");
        biblioteca.listarLibros();

        // Buscar un libro por ISBN
        System.out.println("Buscar libro por ISBN:");
        Libro buscado = biblioteca.buscarLibroPorIsbn("L003");
        if (buscado != null) buscado.mostrarInfo();

        // Eliminar un libro y mostrar el resto
        System.out.println("Eliminar libro L002:");
        biblioteca.eliminarLibro("L002");
        biblioteca.listarLibros();

        // Mostrar cantidad total de libros
        System.out.println("Cantidad total de libros:");
        System.out.println(biblioteca.obtenerCantidadLibros());

        // Filtrar libros por año
        System.out.println("Libros publicados en 1982:");
        biblioteca.filtrarLibrosPorAnio(1982);

        // Mostrar autores únicos disponibles
        System.out.println("Autores disponibles:");
        biblioteca.mostrarAutoresDisponibles();
    }
}
