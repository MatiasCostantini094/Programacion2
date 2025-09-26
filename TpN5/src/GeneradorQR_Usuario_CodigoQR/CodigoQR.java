
package GeneradorQR_Usuario_CodigoQR;

/**
 *
 * @author matia
 */
public class CodigoQR {
    private String valor;
    private Usuario usuario; // Asociación unidireccional: referencia persistente

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public void mostrarQR() {
        System.out.println("--- Código QR Generado ---");
        System.out.println("Data: " + valor);
        System.out.println("Asociado al usuario: " + usuario.getNombre());
    }

    public String getValor() {
        return valor;
    }
}