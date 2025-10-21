
package Caso3;

/**
 *
 * @author matia
 */
public abstract class Empleado {
    private String nombre;
    private int id;

    public Empleado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    // Método abstracto: obliga a las subclases a implementar su propia lógica salarial.
    public abstract double calcularSueldo();
}