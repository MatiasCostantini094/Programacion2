
package Caso2;

/**
 *
 * @author matia
 */
// Clase abstracta: no se puede instanciar directamente
public abstract class Figura {
    private String nombre; // Atributo

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Método abstracto: Obliga a las subclases a implementarlo.
    
    public abstract double calcularArea(); 
}