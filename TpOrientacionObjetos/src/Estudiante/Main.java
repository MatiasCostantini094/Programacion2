
package Estudiante;
/**
 *
 * @author matia
 */
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Matias", "Costantini", "Programacion", 8.5);

        
        estudiante1.mostrarInfo(); // Estado inicial

        estudiante1.subirCalificacion(1.0);
        estudiante1.mostrarInfo(); // Después de subir

        estudiante1.bajarCalificacion(0.5);
        estudiante1.mostrarInfo(); // Después de bajar
    }
}