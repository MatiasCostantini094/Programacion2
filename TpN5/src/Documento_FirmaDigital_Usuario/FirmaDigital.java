
package Documento_FirmaDigital_Usuario;

/**
 *
 * @author matia
 */
public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario; // Agregación

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    // Getters
    public String getCodigoHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}