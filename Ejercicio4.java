import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double precio; // Cambiado a double para evitar errores de precisión
        char categoria;
        double descuentoPorcentaje = 0.0;
        double montoDescuento, precioFinal;

        System.out.println("Ingrese el precio del producto");
        precio = input.nextDouble(); // Cambiado a nextDouble() para coincidir con el tipo

        System.out.println("Indique si el producto es categoria A, B, o C");
        // Se lee la categoria correctamente
        categoria = input.next().toUpperCase().charAt(0);

        switch (categoria) {
            case 'A' -> descuentoPorcentaje = 0.10;
            case 'B' -> descuentoPorcentaje = 0.15;
            case 'C' -> descuentoPorcentaje = 0.20;
            default -> System.out.println("La categoria ingresada no es correcta.");
        }

        // Mostramos el resultado
        if (descuentoPorcentaje > 0) {
            montoDescuento = precio * descuentoPorcentaje;
            precioFinal = precio - montoDescuento;

            System.out.println("Se aplica un descuento del  " + montoDescuento + " % " + " Siendo el precio final de : $"+ precioFinal);
        }

        input.close();
    }
}