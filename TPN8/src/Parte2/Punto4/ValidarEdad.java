
package Parte2.Punto4;

/**
 *
 * @author matia
 */
public class ValidarEdad {
    public static void main(String[] args) {
        int edad = -5; // Cambiar para probar

        try {
            validarEdad(edad);
            System.out.println("Edad válida: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println(" ⚠️ " + e.getMessage());
        }
    }

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad fuera de rango permitido (0-120).");
        }
    }
}