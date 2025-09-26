
package Vehiculo_Motor_Conductor;

/**
 *
 * @author matia
 */
public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo; // Atributo para la asociación bidireccional

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    // Método para establecer la asociación con Vehiculo
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }
    
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}