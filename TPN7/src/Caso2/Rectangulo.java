
package Caso2;

/**
 *
 * @author matia
 */
public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre); // Llama al constructor de la clase base 
        this.base = base;
        this.altura = altura;
    }

    // Implementación obligatoria del método abstracto de la superclase
    @Override
    public double calcularArea() {
        return base * altura;
    }
}
