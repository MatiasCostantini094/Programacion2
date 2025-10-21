
package Caso4;

/**
 *
 * @author matia
 */
public class Animal {
    private String tipo;

    public Animal(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    // Método que será sobrescrito por las subclases
    public void hacerSonido() {
        System.out.println("El animal hace un sonido genérico.");
    }

    public void describirAnimal() {
        System.out.println("Este es un animal de tipo: " + tipo);
    }
}
