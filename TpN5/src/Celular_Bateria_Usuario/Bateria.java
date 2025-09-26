
package Celular_Bateria_Usuario;

/**
 *
 * @author matia
 */
public class Bateria {
    private String modelo;
    private int capacidad; 

    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    // Getters
    public String getModelo() {
        return modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }
}
