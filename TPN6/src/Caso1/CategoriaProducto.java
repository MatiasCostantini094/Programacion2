
package Caso1;

/**
 *
 * @author matia
 */
// Enum representa las categorías posibles de productos en el inventario
public enum CategoriaProducto {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");
    
    
    // Atributo que guarda la descripción de cada categoría
    private final String descripcion;
    
        // Constructor
    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }
        
    // Método para obtener la descripción 
    public String getDescripcion() {
        return descripcion;
    }
}
