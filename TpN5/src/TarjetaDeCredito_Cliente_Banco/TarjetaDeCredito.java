
package TarjetaDeCredito_Cliente_Banco;

/**
 *
 * @author matia
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Banco banco; // Relación de agregación
    private Cliente cliente; // Relación de asociación bidireccional

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco, Cliente cliente) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        // Agregación: se recibe un objeto Banco existente
        this.banco = banco;

        // Asociación bidireccional: se establece la relación en ambos sentidos
        this.cliente = cliente;
        if (cliente.getTarjeta() != this) { // Para evitar un loop infinito
            cliente.setTarjeta(this);
        }
    }

    // Getters
    public String getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Banco getBanco() {
        return banco;
    }

    public Cliente getCliente() {
        return cliente;
    }
}