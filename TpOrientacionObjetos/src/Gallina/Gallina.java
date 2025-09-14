
package Gallina;

public class Gallina {
    // Atributos de la gallina
    String idGallina;
    int edad;
    int huevosPuestos;

    // Constructor para inicializar el objeto Gallina
    public Gallina(String idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    // Método para simular que la gallina pone un huevo
    public void ponerHuevo() {
        this.huevosPuestos++; // Aumenta en 1 el contador de huevos
    }

    // Método para simular que la gallina envejece
    public void envejecer() {
        this.edad++; // Aumenta en 1 la edad
    }

    // Método para mostrar el estado actual de la gallina
    public void mostrarEstado() {
        System.out.println("--- Estado de la Gallina: " + this.idGallina + " ---");
        System.out.println("  Edad: " + this.edad + " años");
        System.out.println("  Huevos puestos: " + this.huevosPuestos);
        System.out.println("-------------------------------------");
    }
}