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
public class Error {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        // Usamos nextLine() para leer la entrada como un String
        String nombre = scanner.nextLine(); 
        
        System.out.println("Hola, " + nombre);
        
    }
}

