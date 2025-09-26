
package Pasaporte_Foto_Titular;


public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // Atributo para la asociación bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Método para establecer la asociación con Pasaporte
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
    
    public Pasaporte getPasaporte() {
        return pasaporte;
    }
}