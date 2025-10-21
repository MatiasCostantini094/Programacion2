
package Caso4;

/**
 *
 * @author matia
 */
public class Perro extends Animal {
    public Perro() {
        super("Perro"); // Llama al constructor de la clase base
    }

    @Override // Indica que este método sobrescribe uno de la superclase
    public void hacerSonido() {
        System.out.println(getTipo() + " dice: ¡Guau guau!");
    }
}




