
package Impuesto_Contribuyente_Calculadora;

/**
 *
 * @author matia
 */
public class Calculadora {
    public void calcular(Impuesto impuesto) {
        double monto = impuesto.getMonto();
        Contribuyente c = impuesto.getContribuyente();

        // Ejemplo de cálculo (puede adaptarse)
        double resultado = monto * 0.21; // Supongamos IVA

        System.out.println("Contribuyente: " + c.getNombre() + " - CUIL: " + c.getCuil());
        System.out.println("Monto original: $" + monto);
        System.out.println("Monto con impuesto aplicado: $" + (monto + resultado));
    }
}