
package Caso3;

/**
 *
 * @author matia
 */
public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;
    private double bonoAnual;

    public EmpleadoPlanta(String nombre, int id, double sueldoBase, double bonoAnual) {
        super(nombre, id);
        this.sueldoBase = sueldoBase;
        this.bonoAnual = bonoAnual;
    }

    @Override
    public double calcularSueldo() {
        //  sueldo base es mensual y el bono 
        return sueldoBase + (bonoAnual / 12);
    }

    // Método específico de esta subclase
    public void recibirBono() {
        System.out.println(getNombre() + " (ID: " + getId() + ") ha recibido su bono anual.");
    }
}
