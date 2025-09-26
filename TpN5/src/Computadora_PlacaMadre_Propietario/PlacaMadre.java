
package Computadora_PlacaMadre_Propietario;

/**
 *
 * @author matia
 */
public class PlacaMadre {
    private String modelo;
    private String chipset;

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    // Getters
    public String getModelo() {
        return modelo;
    }

    public String getChipset() {
        return chipset;
    }
}