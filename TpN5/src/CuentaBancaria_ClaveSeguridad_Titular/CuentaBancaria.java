
package CuentaBancaria_ClaveSeguridad_Titular;

/**
 *
 * @author matia
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad; // Composición
    private Titular titular; // Asociación bidireccional

    public CuentaBancaria(String cbu, double saldo, String codigoClave, String ultimaModificacionClave, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        // Composición: la ClaveSeguridad se crea junto con la CuentaBancaria
        this.claveSeguridad = new ClaveSeguridad(codigoClave, ultimaModificacionClave);

        // Asociación bidireccional: se establece la relación en ambos sentidos
        this.titular = titular;
        if (titular.getCuenta() != this) { // Para evitar un loop infinito
            titular.setCuenta(this);
        }
    }

    // Getters
    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    public Titular getTitular() {
        return titular;
    }
}