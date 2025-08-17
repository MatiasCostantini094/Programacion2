
import java.util.Scanner;


/**
 *
 * @author matia
 */
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numerosPositivo = 0;
        int numerosNegativo = 0;
        int ceros = 0;
        int numeros;
        
        System.out.println(" Ingrese 10 numeros enteros ");
        
        for (int i = 0; i <10; i++){
            System.out.println("Numero " + (i+1) + ":");
            numeros = input.nextInt();
            
            if(numeros > 0){
               numerosPositivo++;
            } else if (numeros < 0){
               numerosNegativo++;
            } else{
                ceros++;
            } 
        }
        System.out.println("Numeros Positivos :" + numerosPositivo);
        System.out.println("Numeros Negativos :" + numerosNegativo);
        System.out.println("Numeros Ceros :" + ceros);
        }
    }
    

