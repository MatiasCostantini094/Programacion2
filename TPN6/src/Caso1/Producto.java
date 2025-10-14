
package Caso1;

/**
 *
 * @author matia
 */
    // Clase que representa un producto dentro del inventario

public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;
    
    
    // Constructor para inicializar el producto
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    // Métodos getter para acceder a los atributos
    public String getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }
    
    // Método setter para actualizar la cantidad
    public void setCantidad(int nuevaCantidad) {
        this.cantidad = nuevaCantidad;
    }
    
    // Método para mostrar la información completa del producto
    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Categoría: " + categoria + " - " + categoria.getDescripcion());
        System.out.println("-----------------------------");
    }
}