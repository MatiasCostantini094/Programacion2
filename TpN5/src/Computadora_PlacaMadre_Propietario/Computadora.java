
package Computadora_PlacaMadre_Propietario;

/**
 *
 * @author matia
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; // Relación de composición
    private Propietario propietario; // Relación de asociación bidireccional

    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipsetPlaca, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        // Composición: la PlacaMadre se crea junto con la Computadora
        this.placaMadre = new PlacaMadre(modeloPlaca, chipsetPlaca);

        // Asociación bidireccional: se establece la relación en ambos sentidos
        this.propietario = propietario;
        if (propietario.getComputadora() != this) { // Para evitar un loop infinito
            propietario.setComputadora(this);
        }
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }
}