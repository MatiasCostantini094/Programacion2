
package Pasaporte_Foto_Titular;

/**
 *
 * @author matia
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto; // Relación de composición
    private Titular titular; // Relación de asociación bidireccional

    public Pasaporte(String numero, String fechaEmision, String imagenFoto, String formatoFoto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        // Composición: la foto se crea junto con el pasaporte
        this.foto = new Foto(imagenFoto, formatoFoto);
        
        // Asociación bidireccional
        this.titular = titular;
        if (titular.getPasaporte() != this) { // Evita bucles infinitos
            titular.setPasaporte(this);
        }
    }

    // Getters y setters
    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }
    
    public Foto getFoto() {
        return foto;
    }
    
    public Titular getTitular() {
        return titular;
    }
}