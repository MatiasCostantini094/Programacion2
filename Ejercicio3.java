
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author matia
 */
public class Ejercicio3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int edad;
    
    System.out.println("Ingrese su edad ");
    edad = input.nextInt();
    
    if (edad < 12 ) {
        System.out.println("Eres menor de edad");
    }
      else if (edad >= 12 && edad <= 17){
        System.out.println("Eres un adolecente");
    }
      else if (edad >= 18 && edad <= 59){
        System.out.println("Eres un adulto ");
    }
      else {
        System.out.println("Eres Adulto mayor ");
      }
    }
    
     
}
