
package CitaMedica_Paciente_Profesional;

/**
 *
 * @author matia
 */
public class Paciente {
    private String nombre;
    private String obraSocial;

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getObraSocial() {
        return obraSocial;
    }
}