
package TarjetaDeCredito_Cliente_Banco;

/**
 *
 * @author matia
 */
public class Banco {
    private String nombre;
    private String cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCuit() {
        return cuit;
    }
}