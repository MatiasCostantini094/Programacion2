 import java.util.Scanner;

 public class Ej11 {
   

    // Variable global (de clase) para el porcentaje de descuento
    // 'static' permite el acceso directo sin crear un objeto.
    // 'final' hace que sea una constante.
    private static final double DESCUENTO_ESPECIAL = 0.10; // 10%

    /**
     * Calcula y muestra el precio final con un descuento especial.
     * @param precio El precio original del producto.
     */
    public static void calcularDescuentoEspecial(double precio) {
        // Variable local para almacenar el valor del descuento aplicado
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = input.nextDouble();

        // Llamar al método para calcular y mostrar el descuento
        calcularDescuentoEspecial(precioProducto);
        
        input.close();
    }
}

