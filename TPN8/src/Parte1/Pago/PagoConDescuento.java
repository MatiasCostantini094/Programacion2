package Parte1.Pago;


// PagoConDescuento hereda de Pago
public interface PagoConDescuento extends Pago { 
    /**
     * Aplica un descuento al monto original.
     * @param porcentajeDescuento El porcentaje de descuento (0.0 a 1.0).
     */
    double aplicarDescuento(double porcentajeDescuento); // 
}