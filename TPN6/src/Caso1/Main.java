
package Caso1;

/**
 *
 * @author matia
 */
public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        inventario.agregarProducto(new Producto("P001", "Arroz", 1200, 50, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("P002", "Notebook", 250000, 10, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("P003", "Campera", 18000, 25, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("P004", "Silla", 3500, 15, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("P005", "Auriculares", 3000, 40, CategoriaProducto.ELECTRONICA));

        System.out.println( "Listado completo:");
        inventario.listarProductos();

        System.out.println(" Buscar producto por ID:");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) buscado.mostrarInfo();

        System.out.println(" Eliminar producto P002:");
        inventario.eliminarProducto("P002");
        inventario.listarProductos();

        System.out.println(" Actualizar stock de P001:");
        inventario.actualizarStock("P001", 80);

        System.out.println("Total de stock:");
        System.out.println(inventario.obtenerTotalStock());

        System.out.println(" Producto con mayor stock:");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();

        System.out.println(" Productos entre $1000 y $3000:");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        System.out.println("Categorías disponibles:");
        inventario.mostrarCategoriasDisponibles();
    }
}