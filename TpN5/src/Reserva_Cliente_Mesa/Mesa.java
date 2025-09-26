
package Reserva_Cliente_Mesa;

/**
 *
 * @author matia
 */
public class Mesa {
    private int numero;
    private int capacidad;

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    // Getters y setters
    public int getNumero() {
        return numero;
    }

    public int getCapacidad() {
        return capacidad;
    }
}