
package Mascota;


public class Mascota {
    // Atributos de la mascota
    String nombre;
    String especie;
    int edad;

    // Constructor de la clase para inicializar el objeto
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Método para mostrar la información de la mascota
    public void mostrarInfo() {
        System.out.println("Información de la Mascota:");
        System.out.println("  Nombre: " + this.nombre);
        System.out.println("  Especie: " + this.especie);
        System.out.println("  Edad: " + this.edad + " años");
    }

    // Método para simular el paso del tiempo y aumentar la edad
    public void cumplirAnios() {
        this.edad = this.edad + 1;
        System.out.println(" La edad de " + this.nombre + " ahora es " + this.edad + " años.");
    }
}