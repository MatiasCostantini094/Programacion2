
import java.util.Scanner;
/**
 *
 * @author matia
 */
public class Ejercicio7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    int nota;
        
            
        do {
            System.out.println(" Ingrese Su nota ");
            nota = input.nextInt();
            if(nota < 0 || nota > 10) {   //se mantiene en el bucle si la nota no es la correcta
            System.out.println("Error Ingrese una nota valida entre 0 y 10 :");
            }
        } while (nota < 0 || nota > 10);// Condicion de salida del bucle 
        
        System.out.println("La nota fue guardada correctamente ");
    }
    
        
    }

