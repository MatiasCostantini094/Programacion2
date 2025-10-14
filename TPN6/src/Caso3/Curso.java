
package Caso3;

/**
 *
 * @author matia
 */

// Clase que representa un curso dictado por un profesor
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    // Asigna o cambia el profesor del curso, sincronizando si se indica
    public void setProfesor(Profesor nuevoProfesor, boolean sincronizar) {
        if (this.profesor != null && sincronizar) {
            this.profesor.eliminarCurso(this, false); // rompe relación anterior
        }
        this.profesor = nuevoProfesor;
        if (nuevoProfesor != null && sincronizar) {
            nuevoProfesor.agregarCurso(this, false); // sincroniza nuevo vínculo
        }
    }

    public void mostrarInfo() {
        System.out.println("Curso: " + nombre);
        System.out.println("Código: " + codigo);
        if (profesor != null) {
            System.out.println("Profesor: " + profesor.getNombre() + " (" + profesor.getId() + ")");
        } else {
            System.out.println("Profesor: No asignado");
        }
        System.out.println("-----------------------------");
    }
}