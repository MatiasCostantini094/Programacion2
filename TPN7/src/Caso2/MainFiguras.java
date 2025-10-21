
package Caso2;

/**
 *
 * @author matia
 */
public class MainFiguras {
    public static void main(String[] args) {
        // Crear un array de Figuras (Upcasting implícito) 
        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo("Círculo Grande", 5.0);
        figuras[1] = new Rectangulo("Rectángulo Base", 4.0, 6.0);
        figuras[2] = new Circulo("Círculo Pequeño", 2.5);

        System.out.println("--- Cálculo de Áreas Polimórfico ---");
        
        // Iterar y calcular el área  
        for (Figura figura : figuras) {
            // El método calcularArea() que se ejecuta depende del tipo real del objeto
            double area = figura.calcularArea(); 
            System.out.println(figura.getNombre() + ": Área = " + String.format("%.2f", area));
        }
    }
}