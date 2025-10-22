

package Parte1.Pago;



public class TarjetaCredito implements Pago { 
    @Override
    public void procesarPago(double monto) { 
        System.out.println("Procesando pago con Tarjeta de Crédito por: " + monto);
        // Lógica de validación de tarjeta y conexión a pasarela...
    }
}