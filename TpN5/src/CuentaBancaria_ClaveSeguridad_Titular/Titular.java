
package CuentaBancaria_ClaveSeguridad_Titular;

/**
 *
 * @author matia
 */
public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta; // Atributo para la asociación bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Método para establecer la asociación con CuentaBancaria
    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
    
    public CuentaBancaria getCuenta() {
        return cuenta;
    }
}