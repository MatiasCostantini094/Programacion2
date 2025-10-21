

package Caso1;

/**
 *
 * @author matia
 */
public class Vehiculo {
    private String marca;
    private String modelo;

    // Constructor de la clase base
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método para mostrar información básica
    public void mostrarInfo() {
        System.out.println("Vehículo: " + marca + " " + modelo);
    }
}
