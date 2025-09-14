
package Gallina;

public class Main {
    public static void main(String[] args) {
        // 1. Crear dos objetos Gallina
        Gallina gallina1 = new Gallina("Gallina-01", 1, 0);
        Gallina gallina2 = new Gallina("Gallina-02", 2, 5);

        // 2. Simular las acciones de la primera gallina
        System.out.println("--- Acciones de la Gallina 1 ---");
        gallina1.ponerHuevo();  // Pone un huevo
        gallina1.ponerHuevo();  // Pone otro huevo
        gallina1.envejecer();   // Envejece un año
        gallina1.mostrarEstado(); // Muestra el estado final

        // 3. Simular las acciones de la segunda gallina
        System.out.println("\n--- Acciones de la Gallina 2 ---");
        gallina2.envejecer();   // Envejece un año
        gallina2.ponerHuevo();  // Pone un huevo
        gallina2.mostrarEstado(); // Muestra el estado final
    }
}