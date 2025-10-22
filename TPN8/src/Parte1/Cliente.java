
package Parte1;

/**
 *
 * @author matia
 */


public class Cliente implements Notificable {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    
    @Override
    public void notificar(String mensaje) {
        System.out.println("\n NOTIFICACIÓN ENVIADA a " + nombre + " (" + email + ")");
        System.out.println("   -> Mensaje: " + mensaje);
    }
    
    public String getNombre() {
        return nombre;
    }
}