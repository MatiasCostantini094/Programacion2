
package Parte1.Pago;

public class PayPal implements PagoConDescuento {
    
    @Override
    public double aplicarDescuento(double porcentajeDescuento) {
        System.out.println(" Aplicando descuento especial de PayPal: " + (porcentajeDescuento * 100) + "%");
        return 1.0 - porcentajeDescuento; 
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("️ Procesando pago con PayPal por: $" + monto);
    }
}