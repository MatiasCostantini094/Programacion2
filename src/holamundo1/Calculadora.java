/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo1;

import java.util.Scanner;

/**
 *
 * @author matia
 */
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 , numero2;
    
        System.out.println("Ingrese el Primer numero ");
        numero1 = scanner.nextInt();
          
          
        System.out.println("Ingrese el segundo numero ");
        numero2 = scanner.nextInt();
    
        int suma = numero1 + numero2 ;
        int multiplicacion = numero1 * numero2 ;
        int division = numero1 / numero2 ;
        int resta = numero1 - numero2 ;
        System.out.println("La suma es :" + suma);
        System.out.println("La resta es :" + resta);
        System.out.println("La division es :" + division);
        System.out.println("La multiplicacion es :" + multiplicacion);
    
    
    }
}
