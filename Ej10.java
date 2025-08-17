
import java.util.Scanner;

public class Ej10 {
    
 
    /**
     * Calcula el nuevo stock de un producto después de una venta y una recepción.
     *
     * @param stockActual     El stock inicial del producto.
     * @param cantidadVendida La cantidad de unidades vendidas.
     * @param cantidadRecibida La cantidad de unidades recibidas.
     * @return El nuevo stock del producto.
     */
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        // La fórmula correcta es: NuevoStock = StockActual - CantidadVendida + CantidadRecibida
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Solicitar y leer los datos del usuario
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = input.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = input.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = input.nextInt();

        // 2. Llamar al método para actualizar el stock y guardar el resultado
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        // 3. Mostrar el stock actualizado
        System.out.println("El nuevo stock del producto es: " + nuevoStock);

        input.close();
    }
}
    
