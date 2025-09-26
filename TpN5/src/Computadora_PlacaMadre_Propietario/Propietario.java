
package Computadora_PlacaMadre_Propietario;

/**
 *
 * @author matia
 */
public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; // Atributo para la asociación bidireccional

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Método para establecer la asociación con Computadora
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    
}