
import java.util.Scanner;


/**
 *
 * @author matia
 */
public class Ejercicio1 {
    // Ejercicio 1

    // AñoBisiesto
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el Año seleccionado: ");
        int anio = scanner.nextInt();
        
        if ((anio % 4 == 0 && anio % 100 != 0)|| (anio % 400 == 0)){
        System.out.println("El año " + anio + " es bisiesto." );
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
        
    }
    
}

