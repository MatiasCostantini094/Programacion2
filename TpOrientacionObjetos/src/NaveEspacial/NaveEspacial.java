
package NaveEspacial;

public class NaveEspacial {
    // Atributos de la nave
    String nombre;
    int combustible; // Se mide en unidades

    // Constructor para inicializar el objeto NaveEspacial
    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    // Método para despegar
    public void despegar() {
        System.out.println(this.nombre + " ha despegado.");
    }

    // Método para avanzar con validación de combustible
    public void avanzar(int distancia) {
        // Validación: cada unidad de distancia consume 1 unidad de combustible
        if (this.combustible >= distancia) {
            this.combustible -= distancia;
            System.out.println(this.nombre + " ha avanzado " + distancia + " unidades de distancia.");
        } else {
            System.out.println("No hay suficiente combustible en " + this.nombre + " para avanzar. Necesita " + distancia + " unidades y tiene " + this.combustible + ".");
        }
    }

    // Método para recargar combustible con validación de límite
    public void recargarCombustible(int cantidad) {
        final int COMBUSTIBLE_MAXIMO = 100;
        int nuevoCombustible = this.combustible + cantidad;
        
        // Validación: no se puede superar el límite máximo
        if (nuevoCombustible <= COMBUSTIBLE_MAXIMO) {
            this.combustible = nuevoCombustible;
            System.out.println(this.nombre + " ha recargado " + cantidad + " unidades. Combustible actual: " + this.combustible);
        } else {
            System.out.println("No se puede recargar. El tanque de " + this.nombre + " solo puede contener un máximo de " + COMBUSTIBLE_MAXIMO + " unidades.");
        }
    }

    // Método para mostrar el estado actual de la nave
    public void mostrarEstado() {
        System.out.println("--- Estado de la Nave Espacial ---");
        System.out.println("  Nombre: " + this.nombre);
        System.out.println("  Combustible: " + this.combustible + " unidades");
        System.out.println("-----------------------------------");
    }
}