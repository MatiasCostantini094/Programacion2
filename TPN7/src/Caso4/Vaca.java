
package Caso4;

/**
 *
 * @author matia
 */
public class Vaca extends Animal {
    public Vaca() {
        super("Vaca"); // Llama al constructor de la clase base
    }

    @Override // Indica que este método sobrescribe uno de la superclase
    public void hacerSonido() {
        System.out.println(getTipo() + " dice: ¡Muuu!");
    }
}