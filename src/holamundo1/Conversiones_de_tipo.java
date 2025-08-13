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
public class Conversiones_de_tipo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double  dividendo , divisor , resultado ;
        
        System.out.println(" Division de numeros enteros ");
        
        
        System.out.println("Ingrese el dividendo (entero)");
        dividendo = scanner.nextInt();
        
        System.out.println("Ingrese el divisor (entero)");
        divisor = scanner.nextInt();
        
        resultado = dividendo / divisor ;
        
        System.out.println("El resultado de la division es :" + resultado);
    
    }
    
    
}
