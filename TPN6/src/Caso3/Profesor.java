
package Caso3;

/**
 *
 * @author matia
 */


import java.util.ArrayList;
import java.util.List;

// Clase que representa a un profesor que da cursos
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    // Agrega un curso a la lista del profesor, sincronizando si se indica
    public void agregarCurso(Curso c, boolean sincronizar) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            if (sincronizar) {
                c.setProfesor(this, false); 
            }
        }
    }

    // Elimina un curso de la lista del profesor, sincronizando si se indica
    public void eliminarCurso(Curso c, boolean sincronizar) {
        cursos.remove(c);
        if (sincronizar && c.getProfesor() == this) {
            c.setProfesor(null, false); 
        }
    }

    public void listarCursos() {
        for (Curso c : cursos) {
            System.out.println("Curso: " + c.getCodigo() + " - " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cantidad de cursos: " + cursos.size());
        System.out.println("-----------------------------");
    }

    public List<Curso> getCursos() {
        return cursos;
    }
}
