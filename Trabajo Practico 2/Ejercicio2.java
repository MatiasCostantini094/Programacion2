
import java.util.Scanner;


/**
 *
 * @author matia
 */
public class Ejercicio2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero1 , numero2 ,numero3, mayor;
    
    System.out.print("Ingrese 3 numeros enteros  ");
    numero1= scanner.nextInt();
    numero2= scanner.nextInt();
    numero3= scanner.nextInt();
    
    mayor = numero1; 
    if (numero2 > mayor) {
        mayor = numero2;
    }
    if (numero3 > mayor){
        mayor = numero3;
    }
     System.out.println("El numero Mayor es "  + mayor);
    }
    
}
