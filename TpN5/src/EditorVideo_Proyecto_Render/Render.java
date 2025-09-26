
package EditorVideo_Proyecto_Render;

/**
 *
 * @author matia
 */
public class Render {
    private String formato;
    private Proyecto proyecto; // Asociación unidireccional: referencia persistente al Proyecto

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    // Método para simular el archivo de salida
    public void mostrarInfo() {
        System.out.println("--- Archivo Renderizado ---");
        System.out.println("Formato: " + formato);
        System.out.println("Origen: " + proyecto.getNombre() + " (" + proyecto.getDuracionMin() + " min)");
    }
}