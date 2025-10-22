
package Parte1;

/**
 *
 * @author matia
 */
public class Producto implements Pagable { 
    private String nombre; 
    private double precio; 

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Implementación del método de la interfaz Pagable 
    @Override
    public double calcularTotal() {
        return precio;
    }
    
    // Getters y Setters 
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    // ...
}