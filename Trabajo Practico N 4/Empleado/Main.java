
package Empleado;

/**
 *
 * @author matia
 */
public class Main {
    public static void main(String[] args) {

        // Instanciar varios objetos con ambos constructores 
        Empleado emp1 = new Empleado(101, "Matias Costantini", "Desarrollador Junior", 300000.0);
        Empleado emp2 = new Empleado("Maria Gomez", "Diseñadora Senior");
        Empleado emp3 = new Empleado("Homero Simpson", "Gerente de Proyecto");
        
        // Imprimir la información de cada empleado usando toString() 
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        
        System.out.println("\n-------------------------------------");

        // Aplicar los métodos de actualización de salario 
        System.out.println("Salario de " + emp1.getNombre() + " antes del aumento: $" + emp1.getSalario());
        emp1.actualizarSalario(10.0); // Aumento del 10%
        System.out.println("Salario de " + emp1.getNombre() + " después del aumento del 10%: $" + emp1.getSalario());

        System.out.println("\nSalario de " + emp2.getNombre() + " antes del aumento: $" + emp2.getSalario());
        emp2.actualizarSalario(25000); // Aumento de $25000
        System.out.println("Salario de " + emp2.getNombre() + " después del aumento de $25000: $" + emp2.getSalario());
        
        System.out.println("-------------------------------------");

        // Mostrar el total de empleados creados con el método estático 
        System.out.println("\nTotal de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}