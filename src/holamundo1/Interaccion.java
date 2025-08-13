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
public class Interaccion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        
        System.out.print("Ingresa tu edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingresa tu nombre");
        nombre = input.nextLine();
        
        System.out.println("Tu nombre es " +nombre);
        System.out.println("Tu edad es " +edad + " Años");
        
} 
}
