
package TarjetaDeCredito_Cliente_Banco;

/**
 *
 * @author matia
 */
public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta; // Atributo para la asociación bidireccional

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Método para establecer la asociación con TarjetaDeCredito
    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }
}