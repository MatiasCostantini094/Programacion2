
package Impuesto_Contribuyente_Calculadora;

/**
 *
 * @author matia
 */
public class Contribuyente {
    private String nombre;
    private String cuil;

    // Constructor
    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getCuil() { return cuil; }
}