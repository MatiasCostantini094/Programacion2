
package NaveEspacial;


public class Main {
    public static void main(String[] args) {
        // 1. Crear un objeto NaveEspacial con 50 unidades de combustible
        NaveEspacial nave1 = new NaveEspacial("Interestelar", 50);

        System.out.println("--- Inicio de la simulación ---");
        nave1.mostrarEstado();

        // 2. Intentar avanzar sin recargar (la validación debe rechazarlo)
        System.out.println("\n--- Intentando avanzar 60 unidades ---");
        nave1.avanzar(60);
        nave1.mostrarEstado();

        // 3. Recargar combustible con una cantidad que supere el límite
        System.out.println("\n--- Intentando recargar 80 unidades (inválido) ---");
        nave1.recargarCombustible(80);
        nave1.mostrarEstado();
        
        // Recargar combustible con una cantidad válida
        System.out.println("\n--- Intentando recargar 40 unidades (válido) ---");
        nave1.recargarCombustible(40);
        nave1.mostrarEstado();

        // 4. Avanzar correctamente después de recargar
        System.out.println("\n--- Intentando avanzar 60 unidades (válido ahora) ---");
        nave1.avanzar(60);
        nave1.mostrarEstado();
    }
}