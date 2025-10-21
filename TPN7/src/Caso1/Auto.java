
package Caso1;

/**
 *
 * @author matia
 */
public class Auto extends Vehiculo {
    private int cantidadPuertas;

    // Constructor de la subclase
    public Auto(String marca, String modelo, int cantidadPuertas) {
        // Invocación al constructor de la superclase con super
        super(marca, modelo); 
        this.cantidadPuertas = cantidadPuertas;
    }

    // Sobrescribimos el método de la clase base usando @Override 
    @Override
    public void mostrarInfo() {
        // Llamamos al método de la superclase para reutilizar su lógica
        super.mostrarInfo(); 
        System.out.println("Es un Auto con " + cantidadPuertas + " puertas.");
    }

    // Tarea: Instanciar y mostrar información
    public static void main(String[] args) {
        // Instanciación del objeto Auto
        Auto miAuto = new Auto("Toyota", "SW4", 4);
        
        // Llamada al método sobrescrito, que muestra la información completa 
        miAuto.mostrarInfo(); 
    }
}