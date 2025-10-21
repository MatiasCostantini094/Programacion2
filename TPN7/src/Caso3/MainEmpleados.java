
package Caso3;

/**
 *
 * @author matia
 */
import java.util.ArrayList;
import java.util.List;

public class MainEmpleados {
    public static void main(String[] args) {
        // Crear una lista de tipo Empleado ->> Upcsting 
        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new EmpleadoPlanta("Alicia Ruiz", 101, 3000.00, 1200.00));
        listaEmpleados.add(new EmpleadoTemporal("Matias Costantini", 205, 15.50, 160));
        listaEmpleados.add(new EmpleadoPlanta("Hernan Montero", 102, 3500.00, 1800.00));

        System.out.println("--- Reporte de Sueldos Polimórfico ---");
        
        // Polimorfismo: se llama al mismo método, pero se ejecuta la implementación correcta.
        for (Empleado emp : listaEmpleados) {
            double sueldo = emp.calcularSueldo();
            System.out.println("ID: " + emp.getId() + " - " + emp.getNombre() + 
                               " | Sueldo Mensual: " + String.format("%.2f", sueldo));
        }
        
        System.out.println("\n--- Tareas Específicas (Clasificación con instanceof) ---");

        // Uso de instanceof para realizar acciones específicas de la subclase
        for (Empleado emp : listaEmpleados) {
            if (emp instanceof EmpleadoPlanta) {
                // Downcasting ->> Se usa instanceof para comprobar antes de castear.
                ((EmpleadoPlanta) emp).recibirBono();
                
            } else if (emp instanceof EmpleadoTemporal) {
                // Downcasting 
                ((EmpleadoTemporal) emp).registrarHoras();
            }
        }
    }
}
