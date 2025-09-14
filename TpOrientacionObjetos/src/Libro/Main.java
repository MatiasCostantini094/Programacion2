
package Libro;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Libro
        Libro libro1 = new Libro("Las Cadenas de la ilusion", "Erich Fromm", 1962);

        System.out.println("--- Información inicial del libro ---");
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Año de publicación: " + libro1.getAnioPublicacion());

        // 1. Intentar modificar el año con un valor inválido (futuro)
        System.out.println("\n--- Intentando modificar el año a 2030 (inválido) ---");
        libro1.setAnioPublicacion(2030);
        
        System.out.println("\n--- Información después del intento ---");
        System.out.println("Año de publicación: " + libro1.getAnioPublicacion()); 

        // 2. Intentar modificar el año con un valor válido
        System.out.println("\n--- Intentando modificar el año a 1945 (válido) ---");
        libro1.setAnioPublicacion(1945);
        
        System.out.println("\n--- Información después de la modificación válida ---");
        System.out.println("Año de publicación: " + libro1.getAnioPublicacion()); 
    }
}