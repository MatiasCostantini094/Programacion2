
package Caso2;

/**
 *
 * @author matia
 */
// Clase que representa a un autor de libros
public class Autor {
    private String id;             
    private String nombre;         
    private String nacionalidad;   

    // Constructor para inicializar los atributos
    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    // Getter para obtener el ID del autor
    public String getId() {
        return id;
    }

    // Muestra la información del autor por consola
    public void mostrarInfo() {
        System.out.println("Autor: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("-----------------------------");
    }
}
