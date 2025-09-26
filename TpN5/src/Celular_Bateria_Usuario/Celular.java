
package Celular_Bateria_Usuario;

/**
 *
 * @author matia
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; // Relación de agregación
    private Usuario usuario; // Relación de asociación bidireccional

    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        // Agregación: se recibe un objeto Bateria existente
        this.bateria = bateria;

        // Asociación bidireccional: se establece la relación en ambos sentidos
        this.usuario = usuario;
        if (usuario.getCelular() != this) { // Para evitar un loop infinito
            usuario.setCelular(this);
        }
    }

    // Getters y setters
    public String getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
