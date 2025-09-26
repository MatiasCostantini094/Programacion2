
package Vehiculo_Motor_Conductor;

/**
 *
 * @author matia
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor; // Agregación
    private Conductor conductor; // Asociación bidireccional

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        // Agregación: se recibe un objeto Motor existente
        this.motor = motor;

        // Asociación bidireccional: se establece la relación en ambos sentidos
        this.conductor = conductor;
        if (conductor.getVehiculo() != this) { // Para evitar un loop infinito
            conductor.setVehiculo(this);
        }
    }

    // Getters
    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public Conductor getConductor() {
        return conductor;
    }
}