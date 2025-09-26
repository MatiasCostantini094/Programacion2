
package EditorVideo_Proyecto_Render;

/**
 *
 * @author matia
 */
public class Proyecto {
    private String nombre;
    private int duracionMin;

    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getDuracionMin() {
        return duracionMin;
    }
}