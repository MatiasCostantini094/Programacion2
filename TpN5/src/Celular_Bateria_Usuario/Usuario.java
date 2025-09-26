
package Celular_Bateria_Usuario;

/**
 *
 * @author matia
 */
public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular; // Atributo para la asociación bidireccional

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Método para establecer la asociación con Celular
    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Celular getCelular() {
        return celular;
    }
}
