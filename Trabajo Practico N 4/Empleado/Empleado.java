
package Empleado;

/**
 *
 * @author matia
 */

public class Empleado {

    //  Atributos encapsulados (privados) 
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    //  Atributo estático: contador global de empleados 
    private static int totalEmpleados = 0;
    
    // Generador de ID automático
    private static int contadorId = 1;

    //  Constructor sobrecargado: recibe todos los atributos 
    public Empleado(int id, String nombre, String puesto, double salario) {
        // this para diferenciar atributos de parámetros 
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        // Ambos constructores deben incrementar el contador
        totalEmpleados++;
    }

    // Constructor sobrecargado: recibe nombre y puesto 
    public Empleado(String nombre, String puesto) {
        // Asignación de ID automático y salario por defecto
        this(contadorId++, nombre, puesto, 250000.0);
    }
    
    //  Métodos sobrecargados: actualizarSalario 
    // Versión Aumenta el salario por porcentaje 
    public void actualizarSalario(double porcentajeAumento) {
        this.salario += this.salario * (porcentajeAumento / 100);
    }

    // Versión  Aumenta el salario por cantidad fija
    public void actualizarSalario(int cantidadFija) {
        this.salario += cantidadFija;
    }

    //  Método toString(): muestra el estado del objeto
    @Override
    public String toString() {
        return (salario) + "ID: " + id + ", Nombre: " + nombre + ", Puesto: " + puesto + ", Salario: $";
    }

    // Método estático: muestra el total de empleados creados 
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // Getters y Setters 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}