
package Caso3;

/**
 *
 * @author matia
 */
public class EmpleadoTemporal extends Empleado {
    private double tarifaPorHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(String nombre, int id, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, id);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return tarifaPorHora * horasTrabajadas;
    }
    
    // Método específico de esta subclase
    public void registrarHoras() {
        System.out.println(getNombre() + " (ID: " + getId() + ") ha registrado " + horasTrabajadas + " horas este mes.");
    }
}
