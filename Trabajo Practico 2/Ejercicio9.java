 

import java.util.Scanner;
public class Ejercicio9 {
    
    // Método para calcular el costo de envío
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            return 0; // Costo 0 si la zona no es válida
        }
    }

    // Método para calcular el total de la compra
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Solicitar datos del usuario
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = input.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = input.nextDouble();
        
        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        String zona = input.next();

        // 2. Usar las funciones para calcular los costos
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double totalAPagar = calcularTotalCompra(precioProducto, costoEnvio);
        
        // 3. Mostrar los resultados
        System.out.println("El costo de envio es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalAPagar);
        
        input.close();
    }
}
