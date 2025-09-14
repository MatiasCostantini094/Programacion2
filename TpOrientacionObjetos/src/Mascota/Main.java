/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascota;

public class Main {
    public static void main(String[] args) {
        // 1. Instanciar una mascota
        Mascota mascota1 = new Mascota("Simon", "Gato", 3);

        // 2. Mostrar la información inicial
        System.out.println("--- Estado Inicial ---");
        mascota1.mostrarInfo();

        // 3. Simular el paso del tiempo (cumple años)
        System.out.println("\n--- Pasando un año ---");
        mascota1.cumplirAnios();

        // 4. Verificar el cambio
        System.out.println("\n--- Estado Final ---");
        mascota1.mostrarInfo();
    }
}