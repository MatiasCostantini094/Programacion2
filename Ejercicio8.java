

import java.util.Scanner;

public class Ejercicio8 {
     
    /**
     * Calcula el precio final de un producto aplicando impuesto y descuento.
     * @param precioBase El precio inicial del producto.
     * @param impuesto El porcentaje de impuesto a aplicar (en formato decimal, ej. 0.10 para 10%).
     * @param descuento El porcentaje de descuento a aplicar (en formato decimal, ej. 0.05 para 5%).
     * @return El precio final calculado.
     */
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precioBase,impuestoPorcentaje,descuentoPorcentaje,impuestoDecimal,descuentoDecimal,precioFinal ;

        // Solicitar y leer los datos del usuario
        System.out.print("Ingrese el precio base del producto: ");
         precioBase = input.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
         impuestoPorcentaje = input.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
         descuentoPorcentaje = input.nextDouble();

        // Convertimos los porcentajes a formato decimal
         impuestoDecimal = impuestoPorcentaje / 100.0;
         descuentoDecimal = descuentoPorcentaje / 100.0;

        // Llama a la funcion para calcular el precio final y mostrar el resultado
         precioFinal = calcularPrecioFinal(precioBase, impuestoDecimal, descuentoDecimal);
        System.out.println("El precio final del producto es: " + precioFinal);

        input.close();
    }
}

