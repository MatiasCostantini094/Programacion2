
package Caso4;

/**
 *
 * @author matia
 */
import java.util.ArrayList;
import java.util.List;

public class MainAnimales {
    public static void main(String[] args) {
        // Crear una lista de tipo Animal (Upcasting)
        List<Animal> granja = new ArrayList<>();
        granja.add(new Perro());
        granja.add(new Gato());
        granja.add(new Vaca());
        granja.add(new Gato());

        System.out.println("--- Comportamiento Animal Polimórfico ---");

        // Polimorfismo: se llama a 'hacerSonido()', pero se ejecuta la implementación
        //  (llamada dinámica de métodos).
        for (Animal a : granja) {
            a.describirAnimal(); // Método heredado
            a.hacerSonido();     // Método sobrescrito polimórficamente
            System.out.println("---");
        }
    }
}
