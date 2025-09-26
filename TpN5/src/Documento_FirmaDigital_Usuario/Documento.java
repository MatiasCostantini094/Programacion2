
package Documento_FirmaDigital_Usuario;

/**
 *
 * @author matia
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital; // Composición

    public Documento(String titulo, String contenido, String codigoHashFirma, String fechaFirma, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        // Composición: La FirmaDigital se crea junto con el Documento
        this.firmaDigital = new FirmaDigital(codigoHashFirma, fechaFirma, usuario);
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }
}