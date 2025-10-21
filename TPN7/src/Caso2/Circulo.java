
package Caso2;

/**
 *
 * @author matia
 */
public class Circulo extends Figura {
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre); // Llama al constructor de la clase base 
        this.radio = radio;
    }

    // Implementación obligatoria del método abstracto de la superclase
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}