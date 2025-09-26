
package Documento_FirmaDigital_Usuario;

/**
 *
 * @author matia
 */
public class Usuario {
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}