
import java.util.Scanner;



/**
 *
 * @author matia
 */
public class Ejercicio5 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    int numeros;
    int sumarPares = 0;
    
    
        System.out.println("Programa para sumar numeros pares . Con el numero 0 termina el programa");
        // El bucle do-while es practico para este problema ya que se ejecuta al menos 1 vez
        do {
            System.out.println("Ingrese un numero");
            numeros = input.nextInt();
            // Vamos a verificar que el numero sea par y no sea 0 
            if(numeros != 0 && numeros %2 == 0 ) {
                sumarPares += numeros; // Se suma el numero para la varible SumarPares
            }  
          }
        while (numeros != 0);// Condicion de salida del bucle 
        System.out.println("La suma del total de los numeros pares es de " + sumarPares);
        }    
}
        
    
    
    
    
    
    
    
    
    
    
    
    
    

